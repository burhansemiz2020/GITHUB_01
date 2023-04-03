public class githubIkinciDers {
    public static void main(String[] args) {
        /*
        Github ilk dersinde ogrendiklerimiz:
        *** GitHub, Git isimli bir version control system(sürüm kontrol sistemi) barindiran cloud tabanli bir uygulamadir.
        *** Git, bireysel küçükprojelerden, ekip olarak calisilançok büyük projelere kadar her şeyi hızlıve verimli bir
        şekilde yonetmek için tasarlanmışücretsiz ve açık kaynaklı,dağıtılmışbir sürüm kontrol sistemidir(distributed version control system).
        *** Git, kaynak kod geçmişinizi yönetmenize ve takip etmenize izin veren bir versionkontrol sistemidir.
        *** GitHub ise, Git depolarını(repo)yönetmenize izin veren bulut tabanlıbir barındırma(hosting)hizmetidir.
        GITHUB TEKLI KULLANIM:
        Uc temel kod vardir:
        1. git add . (local)
        2. git commit -m"newVersion" (local)
        3. git push (local-remote)

        1. git pull (remote-local)
        2. git checkout(local)
        3. git merge (local)

        ANCAK YENI BIR REPOSITORY ACILDIYSA:
        Once calistigimiz classa ait package in C diskinde git uzantisinin oldugunu teyit etmeliyiz.
        Bu asamadan sonra su siralamayla kodlarimizi once git e oradan da github a aktarimini saglariz
        Actigimiz package altindaki classta ya da direk class ta alttaki terminal linkine tiklariz
        1. git init
        2. git add .
        3. git commit -m"commit name"
        4. git remote add origin "repository nin url i" (tirnak yok)
        5. git push -u origin main
        NORMALDE SIRALAMA BU SEKILDE ANCAK
        Eger daha onceden remote origin kayitli ise ve error: remote origin already exists bu hatayi veriyorsa
        1. git remote -v
        2. git remote rm origin
        3. git remote add origin "repository nin url i" (tirnak yok)

        EGER "GIT REMOTE ADD ORIGIN + REPO. URL" GIRDIKTEN SONRA "GIT PUSH --SET UPSTREAM ORIGIN MASTER"
        BU UYARIYI VERIYORSA BU UYARIYI DIREK KOPYALAYIP ALTTAKI YENI CIKAN USER KOD BLOGUNUN SONUNA YAPISTIRIRSAK
        KAYIT ISLEMINE GECIS YAPAR.
            */
        System.out.println("git add");
    }
}
