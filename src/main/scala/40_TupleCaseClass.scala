package yukihide.takahashi

object TupleCaseClassSample {


    // Question 1
    val company: (String, String, Option[String]) = ("nextbeat", "03-5423-6131", Some("東京都渋谷区恵比寿4丁目9-10"))

    def Q2(): String = {
        company._2
    }

    // Question 3
    case class Company(
        name: String,
        phoneNumber: String,
        address: Option[String]
    )

    // Question 4
    val company_caseClass = Company("nextbeat", "03-5423-6131", Some("東京都渋谷区恵比寿4丁目9-10"))
    
    // Question 5
    val company_caseClass2 = company_caseClass.copy(name = "ネクストビート")

    def main(args: Array[String]): Unit = {
        println("~~~~Question2~~~~")
        println(Q2())
    }
}