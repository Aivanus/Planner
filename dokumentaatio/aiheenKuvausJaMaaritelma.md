**Aihe**: Ohjelma, jolla voi tehdä lukujärjestyksiä/suunnitella säännöllisiä askareita. Ohjelmassa tapahtumia lisätään graafisen käyttöliittymän kautta ja ne näkyy graafisesti taulukkona, joka kattaa koko viikon (vrt. perinteinen lukujärjestys). Lukujärjestystä voi muokata ja tulostaa.

**Käyttäjät**: Henkilö

**Käyttäjän toiminnot**: 
* Lisää eventti
* Poista eventti
* Tulosta lukujärjestys

**Luokkakaavio**

**Rakenne**
Ohjelmassa on kuusi luokkaa, jotka jakautuvat kolmeen pakkaukseen. Pakkaus *domain* sisältää luokkia, jotka liittyvät konkreettisiin käsitteisiin, *gui* käyttöliittymään liittyviä luokkia ja *logic* toiminnallisuuteen liittyvän luokan.

*Domainissa* on kolme luokkaa: *Day*, *Task* ja *Time*. *Day* on enumered, joka sisältää kaikki viikonpäivät ja jokaisella päivällä on järjestysnumero (1-9). *Task* on luokka, joka  säilyttää kaiken tiettyyn merkintään liittyvän tiedon, kuten nimen, viikonpäivän ja alkamisajankohdan. *Time*-luokan avulla tallenetaan ajankohdat, kuten *Task*:issa esiintyvät alkamis- ja loppumisajat.


![Luokkakaavio](/dokumentaatio/luokkakaavio_18.02.png)

![Onnistunut eventin luominen](/dokumentaatio/Onnistunut_eventin_luominen_2.png)
![Onnistunut eventin lisääminen lukujärjestykseen](/dokumentaatio/Onnistunut_eventin_lisääminen_lukujärjestykseen.png)
