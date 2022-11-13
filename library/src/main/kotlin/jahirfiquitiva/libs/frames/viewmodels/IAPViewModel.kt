
package jahirfiquitiva.libs.frames.viewmodels

import com.anjlab.android.iab.v3.BillingProcessor
import jahirfiquitiva.libs.archhelpers.viewmodels.ListViewModel

class IAPViewModel : ListViewModel<Array<String>, IAPItem>() {
    var iapBillingProcessor: BillingProcessor? = null
    override fun internalLoad(param: Array<String>): ArrayList<IAPItem> {
        val iaps = ArrayList<IAPItem>()
        try {
            param.forEach {
                val id = it
                val item = iapBillingProcessor?.getPurchaseListingDetails(id)
                item?.let {
                    val name = it.title.substring(0, it.title.lastIndexOf("(")).trim()
                    iaps.add(IAPItem(id, name, it.priceText.trim()))
                }
            }
        } catch (ignored: Exception) {
        }
        return iaps
    }
}

data class IAPItem(val id: String, val name: String, private val price: String) {
    override fun toString(): String = "$name - $price"
}