package de.limago.junit5mitmockitoundjmockit;

import mockit.Mock;
import mockit.MockUp;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.login.LoginContext;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class ServiceUsesDependenciesTest {

    @InjectMocks
    private ServiceUsesDependencies objectUnderTest;

    @org.mockito.Mock
    private NormalDependencyWithInterface normalMock;

    // Faking Static Method
    @Test
    void fakeStaticWithJMockitFakeDemo() {
        new FakeLegacy();

        assertEquals("Other Fake", LegacyCodeWithoutInterfaceForJMockit.foobar());
    }

    // Faking Non-Static Method
    @Test
    void fakeNonStaticWithJMockitFakeDemo() {
        new FakeLegacy();

        assertEquals("Fake", new LegacyCodeWithoutInterfaceForJMockit().bar());
    }

    @Test
    void normalServiceTestWithMockito() {
        Mockito.when(normalMock.foo()).thenReturn("Mock");
        assertEquals("Mock", objectUnderTest.firstServiceMethode());
    }

    @Test
    void normalServiceLegacyTest() {
        new FakeLegacy();
        assertEquals("Fake", objectUnderTest.secondServiceMethode());
    }


    final class FakeLegacy extends MockUp<LegacyCodeWithoutInterfaceForJMockit> {
        @Mock
        public String bar() {
            return "Fake";
        }
        @Mock
        public String foobar() {
            return "Other Fake";
        }


    }
}