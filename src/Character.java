public class Character extends Akatsuki {
    private String rank;
    public void anggota() {
        super.anggota();
        System.out.println("pain adalah sekumpulan mayat yang berjumlah 6 dibuat dan dikendalikan oleh nagato \n");

    }

    public String powerRank(String nama){
        if(nama.equals("zetsu")){
            rank = "Peringkat terakhir diantara anggota akatsuki";
        }else if(nama.equals("obito")){
            rank = "Peringkat pertama dan yang terkuat diantara anggota akatsuki";
        }else if(nama.equals("pain")){
            rank = "Peringkat kedua dari semua anggota akatsuki";
        }else if(nama.equals("itachi")){
            rank = "Peringkat ketiga dari semua anggota akatsuki";
        }else if(nama.equals("kisame")){
            rank = "Peringkat keempat dari semua anggota akatsuki";
        }else if(nama.equals("kakuzu")){
            rank = "Peringkat kelima dari semua anggota akatsuki";
        }else if(nama.equals("konan")){
            rank = "Peringkat keenam dari semua anggota akatsuki";
        }else if(nama.equals("sasori")){
            rank = "Peringkat ketujuh dari semua anggota akatsuki";
        }else if(nama.equals("deidara")){
            rank = "Peringkat kedelapan dari semua anggota akatsuki";
        }else if(nama.equals("hidan")){
            rank = "Peringkat kesembilan dari semua anggota akatsuki";
        }
        return rank;
    }

    public void pilihChar(String nama){
        switch(nama){
            case "zetsu":
                System.out.println("Sebenarnya, Zetsu adalah makhluk hasil ciptaan belaka alias\n" +
                    " bukan termasuk ras manusia. Ia tidak makan, minum, apalagi buang air. Zetsu bisa dibilang\n" +
                    " ‘pohon yang hidup’ karena sebagian besar DNA-nya diresapi oleh sel Hashirama Senju. Itulah\n" +
                    " yang membuatnya bisa muncul di mana saja sesukanya dan menjadi mata-mata terbaik bagi Akatsuki.\n" +
                    " Meski pun yang paling lemah dari anggota lain, nyatanya Zetsu merupakan dalang di balik \n" +
                    "meletusnya perang dunia ninja. Ia sosok yang dikenal menyesatkan dengan segala intrik liciknya \n");
                break;
            case "deidara":
                System.out.println("Satu-satunya teroris paling kuat dalam anime Naruto hanyalah Deidara seorang.\n" +
                        " Ia merupakan ninja pelarian dari Iwagakure dan merupakan tukang bom sejati. Setelah\n" +
                        " informasi kehebatannya menyebar, ia lalu digaet oleh Akatsuki untuk menjadi salah satu \n" +
                        "anggotanya. Jurus-jurus Deidara memanfaatkan tanah liat yang dibentuk menyerupai binatang,\n" +
                        " benda, dan sebagainya kemudian meledakkan ‘karya seni’ tersebut. Pertarungan sengit yang\n" +
                        " berakhir pada kematian anggota Akatsuki termuda ini yaitu saat melawan Sasuke. Deidara\n" +
                        " dikalahkan oleh adik dari Uchiha Itachi yang selalu membuat dirinya terdiskriminasi \n" +
                        "dengan ekspresi ‘kalem’ saat bertarung.");
                break;
            case "kakuzu":
                System.out.println("Kakuzu memiliki tubuh yang terdiri dari salur-salur hitam yang sekilas mirip rambut.\n" +
                        " Wujud perubahannya sangat mengerikan karena ia bisa mengeluarkan bala bantuan monster salur\n" +
                        " yang mana berasal dari topeng di punggungnya. Tiap monster salur memiliki jantung serta\n" +
                        " pikirannya masing-masing. Mereka menggunakan jurus elemen yang sangat dahsyat saat menyerang.\n" +
                        " Kakashi berhasil menghancurkan satu topeng, dan Naruto menghabiskan sisanya.\n" +
                        "Inilah yang membuat Kakuzu setingkat lebih kuat dari Deidara, karena ia dapat mengerahkan \n" +
                        "bala bantuan yang sangat bisa diandalkan.\n");
                break;
            case "hidan":
                System.out.println("Dewa Jasin merupakan Tuhan bagi Hidan. Ia selalu membawa-bawa namanya di setiap\n" +
                        " kesempatan, bahkan saat bertarung sekali pun. Kakuzu adalah rekan terbaiknya di Akatsuki,\n" +
                        " meski terkadang perbedaan pendapat di antara mereka berdua memicu pertengkaran. Namun,\n" +
                        " gabungan kekuatan dari dua pria ini sangatlah saling melengkapi, sebab Kakuzu merupakan \n" +
                        "petarung jarak jauh yang siaga melindungi Hidan sebagai petarung jarak dekat. Selain itu, \n" +
                        "keduanya begitu sulit untuk dibunuh. Terutama Hidan, karena sesungguhnya ia tidak bisa mati \n" +
                        "meski tubuhnya dimutilasi dan dibelah-belah menjadi beberapa bagian.\n");
                break;
            case "sasori":
                System.out.println("Sasori ialah salah satu anggota Akatsuki yang setingkat lebih kuat dari Hidan.\n" +
                        " Ia adalah ninja pengkhianat dari Sunagakure yang dikenal sebagai ‘Dewa Boneka’. Dulunya, \n" +
                        "ia diasuh oleh Nenek Chiyo yang merupakan ahli-boneka. Kemampuan mengendalikan boneka \n" +
                        "diwarisi Sasori dari wanita tua ini. Pertarungan menegangkan sekaligus menyedihkan dari \n" +
                        "mereka berdua (ditambah Sakura di pihak Nenek Chiyo) sangat membekas di benak penonton.\n" +
                        " Setelah melalui adu serangan boneka, Sasori tewas dengan damai dalam pelukan kedua \n" +
                        "boneka tiruan orangtuanya.\n");
                break;
            case "konan":
                System.out.println("Di desa Amegakure, Konan digadang-gadang sebagai malaikat pelindung bagi penduduk.\n" +
                        " Ia merupakan salah satu ‘kunoichi’ terhebat yang pernah menjadi murid Jiraiya bersama \n" +
                        "Nagato dan Yahiko. Gadis berambut biru ini menggunakan kertas sebagai senjata utamanya.\n" +
                        " Kertas-kertas tersebut bisa membentuk shuriken, kunai, bahkan senjata tajam lainnya. \n" +
                        "Selain itu, Konan dapat memanipulasi jutaan kertas yang menyatu dengan tubuhnya menjadi sayap.\n" +
                        " Hal inilah yang membuat dirinya bisa mengambang bebas di angkasa. Ketika bertarung melawan\n" +
                        " Tobi, ia menimbun 600 milyar kertas peledak yang membentuk lautan api.\n");
                break;
            case "kisame":
                System.out.println("Cukup sulit untuk menentukan anggota Akatsuki yang lebih kuat dari Konan itu siapa,\n" +
                        " dan pilihan akhirnya jatuh pada Kisame Hoshigaki. Pria hiu ini disebut sebagai monster dari \n" +
                        "Kirigakure karena selain penampilannya yang mirip ikan, ia juga tidak segan untuk membunuh\n" +
                        " orang lain. Kisame memiliki pedang legendaris bernama Samehada yang bisa mengembangkan\n" +
                        " durinya, menggigit, serta menyerap cakra lawan hingga tiada sisa. Ia sering terlihat bersama\n" +
                        " Itachi Uchiha dalam menjalankan misinya di bawah naungan Akatsuki. Kisame adalah musuh\n" +
                        " terbesar Guru Guy dan pertarungan yang dahsyat dari mereka berdua terjadi berkali-kali.\n");
                break;
            case "pain":
                System.out.println("Pain merupakan sekumpulan mayat yang dimanipulasi Nagato untuk kemudian\n" +
                        " dikendalikan olehnya. Beberapa jurusnya diketahui mengadopsi kemampuan Reikudo Sennin dan\n" +
                        " sering menciptakan kerusakan yang begitu besar. Jiraiya dibunuh oleh mayat-mayat hidup ini.\n" +
                        " Namun di sebuah pertempuran, Pain berhasil dikalahkan oleh Naruto. Pemuda berambut kuning\n" +
                        " yang menjadi tokoh sentral tersebut meminjam kekuatan Kurama dan dibantu oleh Sennin Katak\n" +
                        " dalam mengalahkannya. Kecuali Nagato, ia mati kehabisan cakra karena memulihkan Konoha\n" +
                        " setelah berhasil disadarkan oleh Naruto.\n");
                break;
            case "itachi":
                System.out.println("Seorang genius dari Konoha. Di masa mudanya ia berhasil memberantas klannya\n" +
                        " sendiri dan kemudian pergi meninggalkan kampung halaman. Sebenarnya, Itachi tidak bisa \n" +
                        "disalahkan atas peristiwa pembantaian tersebut. Ia hanya menjalankan misi rahasia dari \n" +
                        "Hokage untuk membantai seluruh klan Uchiha yang diduga akan melakukan makar. Tragedi \n" +
                        "inilah yang membuatnya mendapat kekuatan mata terhebat sepanjang sejarah. Meski ditakuti\n" +
                        " oleh hampir semua ninja di dunia, bahkan termasuk Obito sendiri, Itachi memilih mati di \n" +
                        "tangan Sasuke. Kekalahan itu sesungguhnya dilakukan oleh Itachi atas dasar\n" +
                        "penebusan dosa pada adiknya.\n");
                break;
            case "obito":
                System.out.println("Obito adalah yang terkuat dari seluruh anggota Akatsuki. Ia merupakan dalang \n" +
                        "yang membuat episode Naruto begitu panjang. Dengan menguasai kemampuan Jinchuriki Juubi,\n" +
                        " Obito memperoleh kekuatan Reikudo dan kemudian membangkitkan ‘Pohon Dewa’. Jika tanpa \n" +
                        "kekuatan ini, Itachi yakin bisa mengalahkan Obito dengan mudah. Fakta membuktikan belum \n" +
                        "ada yang berhasil mengalahkan Obito ketika perang dunia ninja pecah. Ia malah ‘insyaf’\n" +
                        " setelah mendengar ceramah dari Naruto. Sepertinya ceramah adalah jurus terhebat yang \n" +
                        "hanya dimiliki oleh pemuda tersebut.\n");
                break;

        }
        powerRank(nama);
        System.out.println(nama+" merupakan "+rank);
    }
}
