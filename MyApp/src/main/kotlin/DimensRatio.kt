enum class DimensRatio(index: Int) {
    LDPI(0) {
        override fun pathName(): String = "values-ldpi"
        override fun getRatio(): Float = 320f / 360f
    },
    MDPI(0) {
        override fun pathName(): String = "values-mdpi"
        override fun getRatio(): Float = 320f / 360f
    },
    HDPI(0) {
        override fun pathName(): String = "values-hdpi"
        override fun getRatio(): Float = 320f / 360f
    },
    XHDPI(0) {
        override fun pathName(): String = "values-xhdpi"
        override fun getRatio(): Float = 360f / 360f
    },
    XXHDPI(0) {
        override fun pathName(): String = "values-xxhdpi"
        override fun getRatio(): Float = 360f / 360f
    },
    XXXHDPI(0) {
        override fun pathName(): String = "values-xxxhdpi"
        override fun getRatio(): Float = 420f / 360f
    },
    W410DP_XXHDPI(0) {
        override fun pathName(): String = "values-w410dp-xxhdpi"
        override fun getRatio(): Float = 410f / 360f
    },
    W360DP_XXXHDPI(0) {
        override fun pathName(): String = "values-w360dp-xxxhdpi"
        override fun getRatio(): Float = 360f / 360f
    };

    abstract fun pathName(): String
    abstract fun getRatio(): Float
}