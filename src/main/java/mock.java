import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
class MaClasseTest {
    @Mock
    MonInterface maMock;
    @Test
    void monTest() {
// Arrange
       this.maMock = mock(MonInterface.class);
        when(maMock.maMethode()).thenReturn("mock");
        MaClasse maClasse = new MaClasse();
// Act
        String resultat = maClasse.maMethode();
// Assert
        Assertions.assertEquals("mock", resultat);
    }

    public interface MonInterface{
        String maMethode();
    }

    public class MaClasse implements MonInterface{


        @Before
        public void setUp() {
            MockitoAnnotations.initMocks(this);
        }
        
        @Override
        public String maMethode() {
            return null;
        }
    }
}