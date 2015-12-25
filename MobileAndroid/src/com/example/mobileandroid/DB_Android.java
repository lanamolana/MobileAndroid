package com.example.mobileandroid;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DB_Android extends SQLiteOpenHelper {
	final static String DB_NAME = "db_androids";

	public DB_Android(Context context) {
		super(context, DB_NAME, null, 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		String sql = "CREATE TABLE IF NOT EXISTS androids(_id INTEGER PRIMARY KEY AUTOINCREMENT, nama TEXT, versi TEXT, api TEXT, fitur TEXT,tgl_rilis TEXT, img BLOB)";
		db.execSQL(sql);

		ContentValues values = new ContentValues();
		values.put("_id", "1");
		values.put("nama", "Alpha");
		values.put("versi", "android 1.0");
		values.put("api","API Level 1");
		values.put("fitur", "- Android Market, untuk mengunduh dan memperbarui aplikasi melalui toko aplikasi resmi Android.\n" +
				"- Penjelajah web, untuk menampilkan, memperbesar dan melihat dalam layar penuh halaman web HTML dan XHTML.\n" +
				"- Dukungan kamera, versi ini tidak memiliki pilihan untuk mengubah resolusi kamera, kejernihan, kualitas foto, dan sebagainya.\n" +
				"- Memungkinkan pengelompokan sejumlah ikon aplikasi ke dalam satu folder di layar depan (homescreen).\n" +
				"- Akses ke server surel web, mendukung POP3, IMAP4, dan SMTP.\n" +
				"- Sinkronisasi Gmail dengan aplikasi Gmail.\n" +
				"- Google Maps, dengan Latitude dan Street View untuk melihat peta dan citra satelit, serta menemukan lokasi bisnis dan petunjuk arah mengemudi dengan menggunakan GPS.\n" +
				"- Pesan instan, pesan teks (SMS), dan MMS.\n" +
				"- Pemutar media, untuk mengelola, mengimpor, dan memutar berkas media, namun versi ini tidak menyediakan dukungan video dan Bluetooth stereo.\n" +
				"- Notifikasi muncul pada status bar, dengan pilihan untuk mengatur nada dering, LED, atau nada getar. " +
				"dll");
		values.put("tgl_rilis", "23 September 2008");
		values.put("img", R.drawable.alpha);
		db.insert("androids", "_id", values);
		
		values.put("_id", "2");
		values.put("nama", "Beta");
		values.put("versi", "android 1.1");
		values.put("api","API Level 2");
		values.put("fitur", "- Rincian dan tinjauan tersedia saat pengguna mencari lokasi bisnis pada Peta.\n" +
				"- Kemampuan untuk menampilkan/menyembunyikan tombol panggilan.\n" +
				"- Kemampuan untuk menyimpan lampiran pada pesan.\n" +
				"- Menambah dukungan marquee pada tata ruang sistem. " +
				"dll");
		values.put("tgl_rilis", "9 Februari 2009");
		values.put("img", R.drawable.beta);
		db.insert("androids", "_id", values);

		values.put("_id", "3");
		values.put("nama", "Cupcake");
		values.put("versi", "android 1.5");
		values.put("api","API Level 3");
		values.put("fitur", "- Dukungan papan ketik virtual pihak ketiga dengan prediksi teks dan kamus pengguna.\n" +
				"- Dukungan Widget – tampilan aplikasi miniatur yang tertanam dalam aplikasi lain dan menerima pembaruan secara periodik.\n" +
				"- Kemampuan merekam dan memutar video berformat MPEG-4 dan 3GP.\n" +
				"- Kemampuan memasangkan (pairing) dan dukungan stereo bagi Bluetooth (A2DP dan AVRCP).\n" +
				"- Fitur salin dan tempel pada penjelajah web.\n" +
				"- Tanggal/waktu ditampilkan pada log panggilan, dan akses satu sentuhan ke nomor kontak dari log panggilan.\n" +
				"- Transisi layar animasi. " +
				"dll");
		values.put("tgl_rilis", "30 April 2009");
		values.put("img", R.drawable.cupcake);
		db.insert("androids", "_id", values);
		
		values.put("_id", "4");
		values.put("nama", "Donut");
		values.put("versi", "android 1.6");
		values.put("api","API Level 4");
		values.put("fitur", "- Entri pencarian teks dan suara diperluas, termasuk menyertakan riwayat bookmark, kontak, dan web.\n" +
				"- Mesin sintesis pengucapan multibahasa yang memungkinkan aplikasi Android tertentu mampu mengucapkan teks.\n" +
				"- Galeri, kamera, dan perekam video yang lebih terintegrasi, dengan akses kamera yang lebih cepat.\n" +
				"- Kemampuan memilih banyak foto untuk dihapus.\n" +
				"- Dukungan bagi resolusi layar WVGA.\n" +
				"dll");
		values.put("tgl_rilis", "15 September 2009");
		values.put("img", R.drawable.donut);
		db.insert("androids", "_id", values);
		
		values.put("_id", "5");
		values.put("nama", "Eclair");
		values.put("versi", "android 2.0/2.0.1/2.1");
		values.put("api","API Level 5/6/7");
		values.put("fitur", "- Dukungan Bluetooth 2.1.\n" +
				"- Menambahkan sejumlah fitur pada kamera, termasuk dukungan kilat (flash), perbesaran digital, mode skin, kejernihan, efek warna, dan fokus makro.\n" +
				"- UI penjelajah web yang baru, dengan fitur bookmark thumbnail, double-tap zoom, dan dukungan bagi HTML5.\n" +
				"- Dukungan bagi lebih banyak resolusi dan ukuran layar, dengan rasio kecerahan yang lebih baik.\n" +
				"- Penyempurnaan tampilan agenda kalender; menampilkan status menghadiri untuk setiap undangan, dan kemampuan untuk mengundang tamu baru ke acara tertentu. " +
				"dll");
		values.put("tgl_rilis", "26 Oktober 2009");
		values.put("img", R.drawable.eclair);
		db.insert("androids", "_id", values);
		
		values.put("_id", "6");
		values.put("nama", "Froyo (Frozen Yoghurt)");
		values.put("versi", "android 2.2/2.2.3");
		values.put("api","API Level 8");
		values.put("fitur", "- Peningkatan peluncur aplikasi dengan jalan pintas ke Telepon dan aplikasi penjelajah web.\n" +
				"- Meningkatkan fungsionalitas USB tethering dan hotspot Wi-Fi.\n" +
				"- Opsi untuk mematikan akses data pada jaringan seluler.\n" +
				"- Pembaruan aplikasi Market dengan menambahkan fitur pembaruan otomatis.\n" +
				"- Dukungan pemasangan aplikasi pada penyimpanan eksternal.\n" +
				"- Dukungan Adobe Flash.\n" +
				"- Dukungan tampilan PPI (hingga 320 ppi), misalnya layar 4inch 720p.\n" +
				"- Gestur pembesaran pada Galeri.\n" +
				"dll");
		values.put("tgl_rilis", "20 Mei 2010");
		values.put("img", R.drawable.froyo);
		db.insert("androids", "_id", values);
		
		values.put("_id", "7");
		values.put("nama", "GingerBread");
		values.put("versi", "android 2.3/2.3.2/2.3.3/2.3.7");
		values.put("api","API Level 9/10");
		values.put("fitur", "- Dukungan bagi resolusi dan ukuran layar ekstra-besar (WXGA dan yang lebih tinggi).\n" +
				"- Masukan teks yang lebih cepat dan lebih intuitif pada papan ketik virtual, dengan meningkatkan akurasi, saran teks yang lebih baik, dan modus input suara.\n" +
				"- Peningkatan fungsi salin/tempel, memungkinkan pengguna untuk memilih kata dengan menekan dan menahan layar.\n" +
				"- Dukungan bagi Near Field Communication (NFC), memungkinkan pengguna untuk membaca tag NFC yang tertanam dalam poster, stiker, atau iklan.\n" +
				"- Efek audio baru seperti reverb, equalizer, virtualisasi penyuara kuping, dan bass boost.\n" +
				"- Dukungan multi kamera pada perangkat, termasuk kamera depan, jika tersedia.\n" +
				"- Dukungan bagi obrolan video atau suara menggunakan Google Talk. " +
				"dll");
		values.put("tgl_rilis", "6 Desember 2010");
		values.put("img", R.drawable.gingerbread);
		db.insert("androids", "_id", values);
		
		values.put("_id", "8");
		values.put("nama", "HoneyComb");
		values.put("versi", "android 3.0/3.1/3.2");
		values.put("api","API Level 11/12/13");
		values.put("fitur", "- Pengotimalan dukungan tablet dengan antarmuka pengguna virtual baru dan 'holografis'.\n" +
				"- Menambahkan System Bar; memberi akses cepat pada notifikasi, status, dan tombol navigasi lunak, yang terdapat di bagian bawah layar.\n" +
				"- Menambahkan Action Bar; memberi akses pada opsi kontekstual, navigasi, widget, ataupun konten-kontan lainnya di bagian atas layar.\n" +
				"- Multi-tugas sederhana – mengetuk Recent Apps pada System Bar akan memungkinkan pengguna untuk melihat cuplikan aplikasi yang sedang berjalan, dan secara cepat bisa berpindah dari suatu aplikasi ke aplikasi lainnya.\n" +
				"- Kemampuan untuk melihat album dan koleksi lainnya dalam mode layar penuh pada galeri.\n" +
				"- UI kontak dua panel dan gulir cepat yang memudahkan pengguna dalam mengelola dan mencari kontak.\n" +
				"- Dukungan prosesor multi-core.\n" +
				"- Dukungan bagi joystick dan gamepad. " +
				"dll");
		values.put("tgl_rilis", "22 Februari 2011");
		values.put("img", R.drawable.honeycomb);
		db.insert("androids", "_id", values);
		
		values.put("_id", "9");
		values.put("nama", "Ice Cream Sandwich");
		values.put("versi", "android 4.0/4.0.2/4.0.3/4.0.4");
		values.put("api","API Level 14/15");
		values.put("fitur", "- Pemisahan widget di tab baru, terletak pada layar yang bersebelahan dengan aplikasi.\n" +
				"- Pembuatan folder yang lebih mudah, dengan gaya drag-and-drop.\n" +
				"- Launcher yang bisa dikustomisasi.\n" +
				"- Pengintegrasian fungsi cuplikan layar (screenshot) dengan menekan dan menahan tombol daya dan volume-turun secara bersamaan.\n" +
				"- Kemampuan untuk mengakses aplikasi secara langsung dari layar kunci (lock screen).\n" +
				"- Penggunaan data bisa dibatasi, pengguna akan diperingatkan jika penggunaan data sudah mendekati batas tertentu, dan menonaktifkan data yang digunakan ketika batas tersebut terlampaui.\n" +
				"- Peningkatan fungsi aplikasi kamera dengan fitur-fitur seperti zero shutter lag, time lapse settings, mode panorama, dan kemampuan untuk memperbesar saat merekam video.\n" +
				"- Penambahan aplikasi pengedit foto bawaan.\n" +
				"- Wi-Fi Direct. " +
				"dll");
		values.put("tgl_rilis", "19 Oktober 2011");
		values.put("img", R.drawable.ics);
		db.insert("androids", "_id", values);
		
		values.put("_id", "10");
		values.put("nama", "Jelly Bean");
		values.put("versi", "android 4.1/4.2/4.3");
		values.put("api","API Level 16/17/18");
		values.put("fitur", "- Papan ketik yang bisa dimodifikasi oleh pengguna.\n" +
				"- Kemampuan untuk mematikan notifikasi pada aplikasi tertentu.\n" +
				"- Shortcut dan widget secara otomatis bisa disusun ulang atau diatur ukurannya.\n" +
				"- Transfer data Bluetooth bagi Android Beam.\n" +
				"- Aplikasi pencarian Google Now.\n" +
				"- Kemampuan untuk menambahkan widget aplikasi tanpa akses root.\n" +
				"- Dukungan tampilan nirkabel (Miracast).\n" +
				"- Perbaikan aksesbilitas: ketuk-tiga kali untuk untuk memperbesar seluruh layar, pan and zoom dengan dua jari, serta keluaran suara dan navigasi Gesture Mode bagi pengguna tunanetra.\n" +
				"- Aplikasi jam baru, disertai dengan jam dunia, stop watch, dan penghitung waktu mundur.\n" +
				"- Notifikasi unduhan yang menampilkan persentase dan waktu perkiraan unduhan. " +
				"dll");
		values.put("tgl_rilis", "9 Juli 2012");
		values.put("img", R.drawable.jb);
		db.insert("androids", "_id", values);
		
		values.put("_id", "11");
		values.put("nama", "KitKat");
		values.put("versi", "android 4.4/4.4.2");
		values.put("api","API Level 19/20");
		values.put("fitur", "- Pembaruan antarmuka dengan bar status dan navigasi transparan pada layar depan.\n" +
				"- Dukungan Bluetooth Message Access Profile (MAP).\n" +
				"- Optimasi kinerja pada perangkat dengan spesifikasi yang lebih rendah.\n" +
				"- Kerangka kerja pencetakan.\n" +
				"- Kerangka kerja akses penyimpanan untuk mengambil konten dan dokumen dari sumber lain.\n" +
				"- Full-Screen Album And Movie Art Combined With Controls.\n" +
				"- Contact Prioritization.\n" +
				"- Enhanced Caller ID.\n" +
				"- Dukungan lebih banyak emoji. " +
				"dll");
		values.put("tgl_rilis", "31 Oktober 2013");
		values.put("img", R.drawable.kitkat);
		db.insert("androids", "_id", values);
		
		values.put("_id", "12");
		values.put("nama", "Lollipop");
		values.put("versi", "android 5.0/5.1");
		values.put("api","API Level 21/22");
		values.put("fitur", "- Desain antarmuka (tampilan) yang dinamakan 'Material Design'.\n" +
				"- 64-bit ART compiler.\n" +
				"- Project volta, yang berguna untuk meningkatkan daya hidup baterai 30% lebih tahan lama.\n" +
				"- Android Runtime (ART).\n" +
				"- OpenGL ES 3.1 dan Android Extension Pack (AEP).\n" +
				"- Audio input dan output kini dimungkinkan melalui sebuah perangkat USB yang mendukung fitur tersebut.\n" +
				"- ‘factory reset protection’. Fitur ini berguna ketika smartphone hilang, ia tidak bisa direset ulang tanpa memasukkan id google dan kata sandi (password). " +
				"dll");
		values.put("tgl_rilis", "3 November 2014");
		values.put("img", R.drawable.lollipop);
		db.insert("androids", "_id", values);
		
		values.put("_id", "13");
		values.put("nama", "MarshMallow");
		values.put("versi", "android 6.0");
		values.put("api","API Level 23");
		values.put("fitur", "- Modus 'Doze'.\n" +
				"- Dukungan USB Type C.\n" +
				"- Android Pay.\n" +
				"- Sensor Sidik Jari.\n" +
				"- 'App Permision' yang memungkinkan pengguna smartphone Android untuk mengatur ijin sebuah aplikasi dengan cara menekan tombol 'Allow' atau 'Deny'.\n" +
				"- Auto Backup Aplikasi.\n" +
				"- Google Now on Tap. " +
				"dll");
		values.put("tgl_rilis", "18 Agustus 2015");
		values.put("img", R.drawable.mars);
		db.insert("androids", "_id", values);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS androids");
		onCreate(db);

	}

}

