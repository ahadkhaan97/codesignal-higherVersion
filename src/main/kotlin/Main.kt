fun main() {
    print(solution("1.2.2", "1.2.0"))
}

fun solution(ver1: String, ver2: String): Boolean {
    val version1 = ver1.split(".")
    val version2 = ver2.split(".")
    for (i in version1.indices) {
        if (version1[i].toInt() > version2[i].toInt())
            return true
        if (version1[i].toInt() < version2[i].toInt())
            return false
    }
    return false
}
