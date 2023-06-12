
    fun myFunction(){
        println("selamat datang")
    }

    fun main(){
        myFunction()
    }
    fun main(args: Array<String>){
        val nama = "Nabilla Allawiyien Putri"
        val usia = 21
        val alamat = "ngawi"

        print("Inputkan universitas: ")
        val Universitas = readLine()
        print("Inputkan semester: ")
        val semester = readLine()

        val template = """
    nama: $nama
    usia: $usia tahun
    alamat: $alamat

    nabilla 5 tahun lagi akan berusia ${usia + 5} tahun
    """

        println(template)
        println("dari universitas $Universitas saat ini sudah semester $semester tahun ini")
    }

