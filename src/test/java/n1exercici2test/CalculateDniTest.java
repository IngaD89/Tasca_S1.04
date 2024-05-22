package n1exercici2test;

import static org.junit.jupiter.api.Assertions.*;

import org.example.n1exercici2.CalculateDni;
import org.example.n1exercici2.Dni;
import org.example.n1exercici2.DummyDni;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class CalculateDniTest {

    static Stream<Arguments> provideDniData() {
        return Stream.of(
                Arguments.of(new Dni(12345678), new CalculateDni(), 'Z'),
                Arguments.of(new Dni(23456789), new CalculateDni(), 'D'),
                Arguments.of(new Dni(34567890), new CalculateDni(), 'V'),
                Arguments.of(new Dni(45678901), new CalculateDni(), 'G'),
                Arguments.of(new Dni(56789012), new CalculateDni(), 'B'),
                Arguments.of(new Dni(67890123), new CalculateDni(), 'B'),
                Arguments.of(new Dni(78901234), new CalculateDni(), 'X'),
                Arguments.of(new Dni(89012345), new CalculateDni(), 'E')
        );
    }


    @Test
    public void checkCalculation(){
        assertEquals('Z', DummyDni.dniZ());
    }

    @ParameterizedTest
    @ValueSource(chars = 'Z')
    public void parametrizedTest(char character){
        assertEquals(character, DummyDni.dniZ());
    }

    @ParameterizedTest
    @MethodSource("provideDniData")
    public void calculateDni(Dni dni, CalculateDni calculateDni, char character){
        assertEquals(character, calculateDni.calculateDniLetter(dni));
    }

}
