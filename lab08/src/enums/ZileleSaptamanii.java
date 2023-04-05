package enums;

public enum ZileleSaptamanii {
    LUNI(0, "Lu") {
        @Override
        public ZileleSaptamanii getMaine() {
            return MARTI;
        }
    }, MARTI(1, "Ma") {
        @Override
        public ZileleSaptamanii getMaine() {
            return MIERCURI;
        }
    }, MIERCURI(2, "Mi") {
        @Override
        public ZileleSaptamanii getMaine() {
            return JOI;
        }
    },
    JOI(3, "Jo") {
        @Override
        public ZileleSaptamanii getMaine() {
            return VINERI;
        }
    }, VINERI(4, "Vi") {
        @Override
        public ZileleSaptamanii getMaine() {
            return SAMBATA;
        }
    },
    SAMBATA(5, "Sa") {
        @Override
        public ZileleSaptamanii getMaine() {
            return DUMINICA;
        }
    },
    DUMINICA(6, "Du") {
        @Override
        public ZileleSaptamanii getMaine() {
            return LUNI;
        }
    };

    private final int index;
    private final String simbol;

    ZileleSaptamanii(int index, String simbol) {
        this.index = index;
        this.simbol = simbol;
    }

    // metode statice
    public static ZileleSaptamanii getZiuaSaptamanii(int i) {
        for (ZileleSaptamanii zi : ZileleSaptamanii.values()) {
            if (zi.getIndex() == i) {
                return zi;
            }
        }
        return null;
    }
    // metode abstracte
    public abstract ZileleSaptamanii getMaine();

    // doar getterii sunt admisi. setterii ar modifica o constanta
    public int getIndex() {
        return index;
    }

    public String getSimbol() {
        return simbol;
    }

    // implementeaza metoda din clasa Object (toString)

    @Override
    public String toString() {
        return "Ziua de " + name() + "{"+
                "index=" + index +
                ", simbol='" + simbol + '\'' +
                '}';
    }

    // equals si hashCode sunt finale pentru ca vorbim de constante si atunci implementarea este oferita de JVM

}
