package tests;

import animals.AnimalType;
import animals.petstore.pet.attributes.Breed;
import animals.petstore.pet.attributes.Gender;
import animals.petstore.pet.attributes.Skin;
import animals.petstore.pet.types.Bird;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BirdTests {

    private static Bird actualBird;

    @BeforeAll
    public static void createAnimals()
    {
        actualBird = new Bird(AnimalType.DOMESTIC, Skin.FEATHERS, Gender.UNKNOWN, Breed.UNKNOWN);
    }


    @Test
    @Order(1)
    @DisplayName("Animal Test Type Tests Domestic")
    public void animalTypeTests()
    {
        assertEquals(AnimalType.DOMESTIC, actualBird.getAnimalType(), "Animal Type Expected[" + AnimalType.DOMESTIC
                + "] Actual[" + actualBird.getAnimalType() + "]");
    }

    @Test
    @Order(1)
    @DisplayName("Bird Speak Tweet Tests")
    public void birdGoesTweetTest()
    {
        assertEquals("The bird goes chirp! chirp!", actualBird.speak(), "I was expecting tweet");
    }

    @Test
    @Order(1)
    @DisplayName("Bird Feathers is it Hypoallergenic")
    public void birdHyperAllergenicTests()
    {
        assertEquals("The bird is not hyperallergetic!", actualBird.birdHypoallergenic(),
                "The bird is not hypoallergetic!");
    }

    @Test
    @Order(1)
    @DisplayName("Bird has legs Test")
    public void legTests()
    {
        Assertions.assertNotNull(actualBird.getNumberOfLegs());
    }

    @Test
    @Order(2)
    @DisplayName("Bird Gender Test FeMale")
    public void genderTestFeMale()
    {
        actualBird = new Bird(AnimalType.WILD, Skin.UNKNOWN,Gender.FEMALE, Breed.UNKNOWN);
        assertEquals(Gender.FEMALE, actualBird.getGender(), "Expecting Female Gender!");
    }

    @Test
    @Order(2)
    @DisplayName("Bird Breed Test HAWK")
    public void genderBirdBreed()
    {
        actualBird = new Bird(AnimalType.WILD, Skin.UNKNOWN,Gender.FEMALE, Breed.HAWK);
        assertEquals(Breed.HAWK, actualBird.getBreed(), "Expecting Hawk!");
    }

    @Test
    @Order(2)
    @DisplayName("Bird Speak Caw Tests")
    public void birdGoesCawTest()
    {
        actualBird = new Bird(AnimalType.WILD, Skin.UNKNOWN,Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The bird goes caw! caw!", actualBird.speak(), "I was expecting caw");
    }

    @Test
    @Order(2)
    @DisplayName("Bird Speak Chirp Tests")
    public void birdGoesChirpTest()
    {
        actualBird = new Bird(AnimalType.UNKNOWN, Skin.UNKNOWN,Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The bird goes Tweet! Tweet!", actualBird.speak(), "I was expecting Chirp");
    }
}
