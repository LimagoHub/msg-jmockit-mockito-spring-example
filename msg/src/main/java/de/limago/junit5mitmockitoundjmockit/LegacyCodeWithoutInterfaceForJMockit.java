package de.limago.junit5mitmockitoundjmockit;

import java.util.UUID;

public class LegacyCodeWithoutInterfaceForJMockit {

    public String bar() {
        return UUID.randomUUID().toString();
    }
    public static String foobar() {
        return UUID.randomUUID().toString();
    }
}
