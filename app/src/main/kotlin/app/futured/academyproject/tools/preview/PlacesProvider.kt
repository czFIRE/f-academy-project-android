package app.futured.academyproject.tools.preview

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import app.futured.academyproject.data.model.local.Place
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf

class PlacesProvider : PreviewParameterProvider<PersistentList<Place>> {
    override val values = sequenceOf(
        persistentListOf(
            Place(
                id = 17641,
                longitude = 16.603794203950443,
                latitude = 49.207958490102975,
                name = "ArtBar Druhý Pád",
                type = "Hudebni klub",
                note = null,
                webUrl = "https://www.druhypad.cz",
                program = "https://www.druhypad.cz/program/?month=03&year=2020",
                street = "Štefánikova",
                streetNumber = "836/1",
                email = "produkce@druhypad.cz",
                phone = "606126866",
                nameEN = "ArtBar Second Fall",
                noteEN = null,
                accessibilityId = null,
                openFrom = null,
                openTo = null,
                image1Url = "https://gis.brno.cz/ost/filebox/ug_file.php?FILE_ID=180659&RECORD_ID=17641&AGENDA_IDENT=GEO_ASSETS",
            ),
            Place(
                id = 17521,
                isFavourite = true,
                longitude = 16.626557231100332,
                latitude = 49.18430405492898,
                name = "Artikle",
                type = "Galerie",
                note = null,
                webUrl = "www.artikle.cz",
                program = "http://artikle.cz/cs/aktuality/",
                street = "Masná",
                streetNumber = "27/9",
                email = "artikle@artikle.cz",
                phone = "739675050",
                nameEN = null,
                noteEN = null,
                accessibilityId = null,
                openFrom = null,
                openTo = null,
                image1Url = "https://gis.brno.cz/ost/filebox/ug_file.php?FILE_ID=180660&RECORD_ID=17521&AGENDA_IDENT=GEO_ASSETS",
            ),
            Place(
                id = 17614,
                longitude = 16.61044283979547,
                latitude = 49.19433156375193,
                name = "Art klub u tří knížat",
                type = "Podnik s kulturním programem",
                note = null,
                webUrl = "www.artklub.cz",
                program = null,
                street = "Jánská",
                streetNumber = "449/12",
                email = "artklubbrno@gmail.com",
                phone = "602968337",
                nameEN = "Art club with three princes",
                noteEN = null,
                accessibilityId = null,
                openFrom = null,
                openTo = null,
                image1Url = "https://gis.brno.cz/ost/filebox/ug_file.php?FILE_ID=180661&RECORD_ID=17614&AGENDA_IDENT=GEO_ASSETS",
            ),
            Place(
                id = 17593,
                longitude = 16.61421186099769,
                latitude = 49.19006443464228,
                name = "Bajkazyl",
                type = "Podnik s kulturním programem",
                note = null,
                webUrl = "www.bajkazyl.cz",
                program = "http://www.bajkazylbrno.cz/#kultura",
                street = "Dornych",
                streetNumber = "420/2",
                email = "email@bajkazyl.cz",
                phone = "774712299",
                nameEN = null,
                noteEN = null,
                accessibilityId = null,
                openFrom = null,
                openTo = null,
                image1Url = "https://gis.brno.cz/ost/filebox/ug_file.php?FILE_ID=180662&RECORD_ID=17593&AGENDA_IDENT=GEO_ASSETS",
            ),
            Place(
                id = 17612,
                longitude = 16.59703281447062,
                latitude = 49.20271549206873,
                name = "Bar Naproti",
                type = "Podnik s kulturním programem",
                note = null,
                webUrl = "www.barnaproti.cz",
                program = null,
                street = "Jana Uhra",
                streetNumber = "162/4",
                email = "info@barnaproti.cz",
                phone = "799503465",
                nameEN = null,
                noteEN = null,
                accessibilityId = null,
                openFrom = null,
                openTo = null,
                image1Url = "https://gis.brno.cz/ost/filebox/ug_file.php?FILE_ID=180663&RECORD_ID=17612&AGENDA_IDENT=GEO_ASSETS",
            ),
            Place(
                id = 17587,
                longitude = 16.606131538823046,
                latitude = 49.19302395826253,
                name = "Bastila",
                type = "Hudebni klub",
                note = null,
                webUrl = "www.bastila.cz",
                program = "http://www.bastila.cz/cs/program/",
                street = "Dominikánská",
                streetNumber = "342/15",
                email = "bastilaclub@seznam.cz",
                phone = "542211492",
                nameEN = null,
                noteEN = null,
                accessibilityId = null,
                openFrom = null,
                openTo = null,
                image1Url = "https://gis.brno.cz/ost/filebox/ug_file.php?FILE_ID=180664&RECORD_ID=17587&AGENDA_IDENT=GEO_ASSETS",
            ),
            Place(
                id = 17625,
                longitude = 16.604157352423787,
                latitude = 49.196248212267044,
                name = "Besední dům",
                type = "Koncertní hala",
                note = null,
                webUrl = "www.filharmonie-brno.cz",
                program = "https://filharmonie-brno.cz/kompletni-program/",
                street = "Komenského náměstí",
                streetNumber = "534/8",
                email = "info@filharmonie-brno.cz",
                phone = "539092801",
                nameEN = "Besední House",
                noteEN = null,
                accessibilityId = "1",
                openFrom = null,
                openTo = null,
                image1Url = "https://gis.brno.cz/ost/filebox/ug_file.php?FILE_ID=180657&RECORD_ID=17625&AGENDA_IDENT=GEO_ASSETS",
            ),
            Place(
                id = 17543,
                longitude = 16.60890136712314,
                latitude = 49.19161999883868,
                name = "Biskupský dvůr",
                type = "Muzeum",
                note = null,
                webUrl = null,
                program = "https://www.mdb.cz/program/biskupsky-dvur/2020-10",
                street = "Muzejní",
                streetNumber = "298/1",
                email = "mzm@mzm.cz",
                phone = "533435282",
                nameEN = "Bishop’s Courtyard, Moravian Museum",
                noteEN = null,
                accessibilityId = "2",
                openFrom = null,
                openTo = null,
                image1Url = "https://gis.brno.cz/ost/filebox/ug_file.php?FILE_ID=180655&RECORD_ID=17543&AGENDA_IDENT=GEO_ASSETS",
            ),
            Place(
                id = 17607,
                longitude = 16.67820074764902,
                latitude = 49.18307811891463,
                name = "Botanické oddělení",
                type = "Muzeum",
                note = null,
                webUrl = "www.mzm.cz/botanicke-oddeleni/",
                program = "http://www.mzm.cz/kalendar/",
                street = "Hviezdoslavova",
                streetNumber = "1183/29",
                email = "botanika@mzm.cz",
                phone = "515910452",
                nameEN = "Botanical department, Moravian Museum",
                noteEN = null,
                accessibilityId = null,
                openFrom = null,
                openTo = null,
                image1Url = "https://gis.brno.cz/ost/filebox/ug_file.php?FILE_ID=180666&RECORD_ID=17607&AGENDA_IDENT=GEO_ASSETS",
            ),
            Place(
                id = 17673,
                longitude = 16.609463009309913,
                latitude = 49.196822302097424,
                name = "Brain Farm",
                type = "Hub",
                note = null,
                webUrl = "http://www.coworkingbrno.cz/",
                program = null,
                street = "Jezuitská",
                streetNumber = "6/1",
                email = "info@brainfarm.cz",
                phone = "608828666",
                nameEN = null,
                noteEN = null,
                accessibilityId = null,
                openFrom = null,
                openTo = null,
                image1Url = "https://gis.brno.cz/ost/filebox/ug_file.php?FILE_ID=180668&RECORD_ID=17673&AGENDA_IDENT=GEO_ASSETS",
            ),
            Place(
                id = 17650,
                longitude = 16.61935080601079,
                latitude = 49.1983027976563,
                name = "Branta Workspace",
                type = "Hub",
                note = null,
                webUrl = "https://www.branta.cz/",
                program = null,
                street = "Cejl",
                streetNumber = "509/41",
                email = "brantabrno@gmail.com",
                phone = "604868249",
                nameEN = null,
                noteEN = null,
                accessibilityId = null,
                openFrom = null,
                openTo = null,
                image1Url = "https://gis.brno.cz/ost/filebox/ug_file.php?FILE_ID=180670&RECORD_ID=17650&AGENDA_IDENT=GEO_ASSETS",
            ),
            Place(
                id = 21422,
                longitude = 16.622567013514846,
                latitude = 49.19976046906091,
                name = "Bývalá Káznice na Cejlu",
                type = "Ostatní",
                note = """Rozsáhlá, původně čtyřkřídlá stavba je už dlouho pohlcená okolní zástavbou, ale v době vzniku stála v místech, kde končily poslední domy na předměstí. Její historie sahá do roku 1770, kdy byla dvorským dekretem zřízena káznice pro celou Moravu. Základní kámen byl položen o dva roky později. V roce 1778 se sem ovšem místo trestanců nastěhovalo 147 sirotků z brněnské jezuitské koleje. V roce 1784 císař Josef II. sirotčinec zrušil, areál se vrátil k původně zamýšlené funkci a během následujících desetiletí sem byli přemístěni trestanci ze Špilberku. Nejtemnější období přišlo s obdobím protektorátu a poté po roce 1948, kdy zde bylo internováno, a také popraveno, velké množství politických vězňů.

            V současné době probíhají snahy o oživení celého komplexu. TIC BRNO v něm pořádá tematické prohlídky a prostory bývají pronajímány k jednorázovým kulturním akcím, např. k výstavám, workshopům, divadelním představením, koncertům apod. Brněnská filmová kancelář bývalou káznici také nabízí jako zajímavou filmovou lokaci.""",
                webUrl = "https://ticbrno.cz/byvala-kaznice-na-cejlu",
                program = "https://www.gotobrno.cz/akce/kaznice-zije/",
                street = "Bratislavská",
                streetNumber = "68",
                email = null,
                phone = null,
                nameEN = "Former Prison on Cejl",
                noteEN = "The large, originally four-winged building has long been absorbed by the surrounding buildings, but at the time of its construction it stood where the last houses in the suburb ended. Its history dates back to 1770, when a court decree established a penitentiary for the whole of Moravia. The foundation stone was laid two years later. In 1778, however, 147 orphans from the Jesuit college in Brno moved in instead of convicts. In 1784, the orphanage was abolished by Emperor Joseph II, the premises were returned to their original function, and in the following decades the convicts from Špilberk were moved here. The darkest period came with the Protectorate and then after 1948, when a large number of political prisoners were interned here and executed.  At present, efforts are underway to revive the entire complex. TIC BRNO organises thematic tours and the premises are rented for one-off cultural events, e.g. exhibitions, workshops, theatre performances, concerts, etc. The Brno Film Office also offers the former penitentiary as an interesting film location.",
                accessibilityId = null,
                openFrom = null,
                openTo = null,
                image1Url = "https://gis.brno.cz/ost/filebox/ug_file.php?FILE_ID=189872&RECORD_ID=21422&AGENDA_IDENT=GEO_ASSETS",
            ),
            Place(
                id = 17558,
                longitude = 16.60624452646237,
                latitude = 49.19435798028908,
                name = "Cabaret des Péchés",
                type = "Hudebni klub",
                note = null,
                webUrl = "https://www.cabaretdespeches.com/",
                program = "https://www.cabaretdespeches.com/program-burleska-burlesque-show-koncert-stand-up/",
                street = "Dominikánské náměstí",
                streetNumber = "0/2",
                email = "info@cabaretdespeches.com",
                phone = "774497277",
                nameEN = null,
                noteEN = null,
                accessibilityId = null,
                openFrom = null,
                openTo = null,
                image1Url = "https://gis.brno.cz/ost/filebox/ug_file.php?FILE_ID=180674&RECORD_ID=17558&AGENDA_IDENT=GEO_ASSETS",
            ),
        ),
    )
}
