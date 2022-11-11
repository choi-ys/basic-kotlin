package compareto

class CompareToTargetClass(private val intValue: Int) : Comparable<CompareToTargetClass> {
    override fun compareTo(other: CompareToTargetClass): Int {
        return compareValuesBy(this, other, CompareToTargetClass::intValue)
    }
}
