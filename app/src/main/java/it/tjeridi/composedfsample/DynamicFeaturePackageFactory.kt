@file:Suppress("SpellCheckingInspection")

package it.tjeridi.composedfsample

object DynamicFeaturePackageFactory {

    private const val PACKAGE = "it.tjeridi."

    object DFFirst{
        const val DF_FIRST_SCREEN = PACKAGE.plus("df_first.DFFirstScreenKt")
        const val COMPOSE_METHOD_NAME = "DFFirstScreen"
    }

    object DFSecond{
        const val DF_SECOND_SCREEN = PACKAGE.plus("df_second.DFSecondScreenKt")
        const val COMPOSE_METHOD_NAME = "DFSecondScreen"
    }

    object DFThird{
        const val DF_THIRD_SCREEN = PACKAGE.plus("df_third.DFThirdScreenKt")
        const val COMPOSE_METHOD_NAME = "DFThirdScreen"
    }




}