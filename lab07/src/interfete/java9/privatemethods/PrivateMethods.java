package interfete.java9.privatemethods;

import interfete.java8.defaultmethods.Poet;

/**
 * Pentru reutilizarea de cod din metodele default
 */
public interface PrivateMethods {
    default void scrie(Poet poet) {
        if (isPoetNotNull(poet)) {
            poet.scrie();
        }
    }

    default void alearga(Poet poet) {
        if (isPoetNotNull(poet)) {
            poet.scrie();
            poet.scrie();
            poet.scrie();
            poet.scrie();
            poet.scrie();
        }
    }

    private boolean isPoetNotNull(Poet poet) {
        return !(poet == null);
    }
}
