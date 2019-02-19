package springfive.cms.domain.controller;

public class NewResource {
    private static NewResource ourInstance = new NewResource();

    public static NewResource getInstance() {
        return ourInstance;
    }

    private NewResource() {
    }
}
