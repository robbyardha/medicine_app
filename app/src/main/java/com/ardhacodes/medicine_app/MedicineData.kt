package com.ardhacodes.medicine_app

object MedicineData {
    private val medicineNames = arrayOf("Ambroxol",
        "Amoxcillin",
        "Antasida Doen",
        "Becom C",
        "Enervon C",
        "Intunal F",
        "Mefinal",
        "Paratusin",
        "Spasminal",
        "Visine")

    private val medDetails = arrayOf("Obat Batuk",
        "Anti Biotik, diminum sesuai resep dokter. Obat ini harus dihabiskan",
        "Obat Maag",
        "Vitamin Yang memiliki kandungan yang kompleks",
        "Vitamin yang bersifat generic",
        "Obat batuk generic",
        "Obat nyeri",
        "Obat batuk",
        "Obat nyeri, biasa diminum saat haid",
        "Obat mata kering")

    private val medImages = intArrayOf(R.drawable.ambroxol,
        R.drawable.amoxicillin,
        R.drawable.antasida,
        R.drawable.becomc,
        R.drawable.enervonc,
        R.drawable.intunalf,
        R.drawable.mefinal,
        R.drawable.paratusin,
        R.drawable.spasminal,
        R.drawable.visine)

    val listData: ArrayList<Medicine>
        get() {
            val list = arrayListOf<Medicine>()
            for (position in medicineNames.indices) {
                val med = Medicine()
                med.name = medicineNames[position]
                med.detail = medDetails[position]
                med.foto = medImages[position]
                list.add(med)
            }
            return list
        }
}