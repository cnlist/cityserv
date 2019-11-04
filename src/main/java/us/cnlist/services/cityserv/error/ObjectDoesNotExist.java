package us.cnlist.services.cityserv.error;

import javax.persistence.NoResultException;

public class ObjectDoesNotExist extends Exception {

    public ObjectDoesNotExist(String message) {
        super(message, new NoResultException(message));
    }

}
