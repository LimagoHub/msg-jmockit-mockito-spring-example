package de.limago.junit5mitmockitoundjmockit;

import org.springframework.stereotype.Service;

@Service
public class ServiceUsesDependencies {
    private final NormalDependencyWithInterface normal;
    private final LegacyCodeWithoutInterfaceForJMockit legacy = new LegacyCodeWithoutInterfaceForJMockit();

    public ServiceUsesDependencies(NormalDependencyWithInterface normal) {
        this.normal = normal;
    }

    public String firstServiceMethode() {

        return normal.foo();
    }

    public String secondServiceMethode() {
        return legacy.bar();
    }

}
