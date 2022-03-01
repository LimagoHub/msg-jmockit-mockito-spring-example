package de.limago.junit5mitmockitoundjmockit;

import org.springframework.stereotype.Component;

@Component
public class NormalDependencyWithInterfaceImpl implements NormalDependencyWithInterface {

    public String foo() {
        return "this is foo impl";
    }
}
