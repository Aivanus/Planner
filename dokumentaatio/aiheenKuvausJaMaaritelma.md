**Aihe**: Ohjelma, jolla voi tehdä lukujärjestyksiä/suunnitella säännöllisiä askareita. Ohjelmassa tapahtumia lisätään graafisen käyttöliittymän kautta ja ne näkyy graafisesti taulukkona, joka kattaa koko viikon (vrt. perinteinen lukujärjestys). Lukujärjestystä voi muokata ja tulostaa.

**Käyttäjät**: Henkilö

**Käyttäjän toiminnot**: 
* Lisää eventti
* Poista eventti
* Tulosta lukujärjestys



**Rakenne**

Ohjelmassa on kuusi luokkaa, jotka jakautuvat kolmeen pakkaukseen. Pakkaus *domain* sisältää luokkia, jotka liittyvät konkreettisiin käsitteisiin, *gui* käyttöliittymään liittyviä luokkia ja *logic* toiminnallisuuteen liittyvän luokan.

*Domainissa* on kolme luokkaa: *Day*, *Task* ja *Time*. *Day* on enumered, joka sisältää kaikki viikonpäivät ja jokaisella päivällä on järjestysnumero (1-9). *Task* on luokka, joka  säilyttää kaiken tiettyyn merkintään liittyvän tiedon, kuten nimen, viikonpäivän ja alkamisajankohdan. *Time*-luokan avulla tallenetaan ajankohdat, kuten *Task*:issa esiintyvät alkamis- ja loppumisajat.

Pakkaus *gui* sisältää ohjelman tärkeimmän luokan: *PlannerGUI*:n. Tämä luokka on Netbeansin Swing builderin tulosta, minkä vuoksi se on __hyvin__ iso ja pitää *Main*:in sisällään. *PlannerGUI* huolehtii komponenttien luonnista, niiden sijainnista ja tapahtumakiintelijoista. Tapahtumakuuntelijat huolehtivat kaikista toiminnoista, ja toimintoihin liittyvä koodi on suurimmaksi osaksi tämän luokan sisällä. Ainoa poikkeus on uuden *Task*-olion luonnista huolehtiva metodi, joka käyttää uuden *Task*:in luomiseen pakkauksessa *logic* sijaitsevaa *TaskFactorya*. Tämän luokka saa parametrina joukon Swing komponentteja ja sen ainoa tehtävä on luoda ja palauttaa uusi *Task*, jos komponenttien sisältämä data on oikea ja null, jos syöte ei kelpaa. *ColorRenderer* on myös pakkauksessa *gui* sijaitseva luokka, joka korvaa lukujärjestyksen esittämiseen käytettävän *JTable*-olion oletusarvoisen rendererin ja mahdollistaa eriväristen solujen esittämisen.

**Luokkakaavio**

![Luokkakaavio](/dokumentaatio/luokkakaavio_18.02.png)

![Onnistunut eventin luominen](/dokumentaatio/Onnistunut_eventin_luominen_2.png)
![Onnistunut eventin lisääminen lukujärjestykseen](/dokumentaatio/Onnistunut_eventin_lisääminen_lukujärjestykseen.png)
