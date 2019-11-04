package us.cnlist.services.cityserv.error;

public class BadRequestError extends Exception {
    public BadRequestError(String message) {
        super(message);
    }
}
