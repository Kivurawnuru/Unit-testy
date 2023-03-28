import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZlomekTest {

    @Test
    void getCitatel() {
    }

    @Test
    void setCitatel() {
        fail("Spatny citatel");
    }

    @Test
    void getJmenovatel() {
        fail("Spatny jmenovatel");
    }

    @Test
    void setJmenovatel() {
    }

    @Test
    void scitani() {
    }

    @Test
    void odcitani() {
    }

    @Test
    void nasobeni() {
    }

    @Test
    void deleni() {
    }

    @Test
    void toString() {
        fail("Spatny to string");
    }

    @Test
    void kraceni() {
    }

    @Test
    int NSD(int a, int b) {
        NSD(20,10);
        assertEquals(10,NSD(20,10),"Nemaji největsi spolecny nasobek");

        return a;
    }
}