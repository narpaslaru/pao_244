package interfete.markers;

/**
 * Testam comportamentul claselor Angajat si AngajatClonabil - identice ca si cod cu exceptia interfetei marker {@link Cloneable}
 */
public class TestClone {
    public static void main(String[] args) {
        System.out.println("########### Testare clasa care nu este Clonable ###########");
        Angajat angajat1 = new Angajat("Andrei", 25, 5000);

        try {
            // deoarece metoda clone() din Object returneaza Object, trebuie facut down-casting explicit
            Angajat angajat2 = (Angajat) angajat1.clone();
        } catch (CloneNotSupportedException e) {
            // deoarece metoda clone() arunca exceptia aceasta, ea trebuie prinsa - vom vedea mai tarziu acest mecanism
            System.out.println("Exceptie la clonare " + e.getMessage());;
        }

        System.out.println("########### Testare clasa care ESTE Clonable ###########");
        // acelasi lucru cu AngajatClonabil
        AngajatClonabil angajatClonabil1 = new AngajatClonabil("Bogdan", 25, 7000);

        try {
            AngajatClonabil angajatClonabil2 = (AngajatClonabil) angajatClonabil1.clone();
            // nu am suprascris metoda toString() ca sa putem sa vedem mai jos ca ele sunt 2 instante diferite, desi contin aceleasi date
            System.out.println("Obiectul original: " + angajatClonabil1);
            System.out.println(angajatClonabil1.getNume() + "|" + angajatClonabil1.getVarsta() + "|" + angajatClonabil1.getSalariu());
            System.out.println("Obiectul clona: " + angajatClonabil2);
            System.out.println(angajatClonabil2.getNume() + "|" + angajatClonabil2.getVarsta() + "|" + angajatClonabil2.getSalariu());
        } catch (CloneNotSupportedException e) {
            System.out.println("Nu ar trebui sa fie nici o exceptie");
        }

        System.out.println("############ Testare clasa cu membru obiect non-clonable");
        Departament finante = new Departament(1, "Finante");
        AngajatClonabilCuDepartamentSimplu angajatClonabilCuDepartamentSimplu1 =
                new AngajatClonabilCuDepartamentSimplu("Cristi", 32, 6000, finante);

        // incercam sa il clonam
        try {
            AngajatClonabilCuDepartamentSimplu angajatClonabilCuDepartamentSimplu2 =
                    (AngajatClonabilCuDepartamentSimplu) angajatClonabilCuDepartamentSimplu1.clone();
            // desi nu este nici o problema, sa vedem ce se intampla
            System.out.println("Departamentul angajatului sursa este: " + angajatClonabilCuDepartamentSimplu1.getDepartament());
            System.out.println("Departamentul angajatului clona este: " + angajatClonabilCuDepartamentSimplu2.getDepartament());

            // modificam departamentul clonei
            angajatClonabilCuDepartamentSimplu2.getDepartament().setDenumire("HR");
            // verificam acum departamentele celor 2 angajati
            System.out.println("Departamentul angajatului sursa este: " + angajatClonabilCuDepartamentSimplu1.getDepartament());
            System.out.println("Departamentul angajatului clona este: " + angajatClonabilCuDepartamentSimplu2.getDepartament());
            // concluzie: deoarece clasa Departament nu implementeaza Cloneable, nu se cloneaza decat referinta
            // asadar ambii angajati sunt legati prin referinta de acelasi departament din memorie
        } catch (CloneNotSupportedException e) {
            System.out.println("Nu ar trebui sa fie nici o exceptie");
        }

        System.out.println("########## Testare clasa clonabila cu membru clonabil #########");
        DepartamentClonabil development = new DepartamentClonabil(1, "Development");
        AngajatClonabilCuDepartamentClonabil angajatClonabilCuDepartamentClonabil1 =
                new AngajatClonabilCuDepartamentClonabil("Cristi", 32, 10000, development);
        try {
            AngajatClonabilCuDepartamentClonabil angajatClonabilCuDepartamentClonabil2 =
                    (AngajatClonabilCuDepartamentClonabil) angajatClonabilCuDepartamentClonabil1.clone();
            // clonam si departamentul

            // desi nu este nici o problema, sa vedem ce se intampla
            System.out.println("Departamentul angajatului sursa este: " + angajatClonabilCuDepartamentClonabil1.getDepartament());
            System.out.println("Departamentul angajatului clona este: " + angajatClonabilCuDepartamentClonabil2.getDepartament());

            // modificam departamentul clonei
            angajatClonabilCuDepartamentClonabil2.getDepartament().setDenumire("HR");
            // verificam acum departamentele celor 2 angajati
            System.out.println("Departamentul angajatului sursa este: " + angajatClonabilCuDepartamentClonabil1.getDepartament());
            System.out.println("Departamentul angajatului clona este: " + angajatClonabilCuDepartamentClonabil2.getDepartament());
            // concluzie: deoarece clasa Departament nu implementeaza Cloneable, nu se cloneaza decat referinta
            // asadar ambii angajati sunt legati prin referinta de acelasi departament din memorie

            // ca sa fie corect, va trebui sa clonam manual obiectele referinte
            angajatClonabilCuDepartamentClonabil2.setDepartament((DepartamentClonabil) angajatClonabilCuDepartamentClonabil1.getDepartament().clone());
            angajatClonabilCuDepartamentClonabil2.getDepartament().setDenumire("Management");
            // verificam din nou departamentele celor 2 angajati
            System.out.println("Departamentul angajatului sursa este: " + angajatClonabilCuDepartamentClonabil1.getDepartament());
            System.out.println("Departamentul angajatului clona este: " + angajatClonabilCuDepartamentClonabil2.getDepartament());
        } catch (CloneNotSupportedException e) {
            System.out.println("Nu ar trebui sa fie nici o exceptie");
        }
    }
}
