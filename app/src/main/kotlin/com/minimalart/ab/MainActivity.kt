
package com.minimalart.ab

import com.github.javiersantos.piracychecker.PiracyChecker
import jahirfiquitiva.libs.frames.ui.activities.FramesActivity

class MainActivity : FramesActivity() {
    /**
     * These things here have the default values. You can delete the ones you don't want to change
     * and/or modify the ones you want to.
     */
    override var donationsEnabled = true
    
    override fun amazonInstallsEnabled(): Boolean = false
    override fun checkLPF(): Boolean = true
    override fun checkStores(): Boolean = true
    
    /**
     * This is your app's license key. Get yours on Google Play Dev Console.
     * Default one isn't valid and could cause issues in your app.
     */
    override fun getLicKey(): String? = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnmQwiMz7Q1JCZcxvfTvJgUhQyb+tfXgPUlL2Wq1ZhrJ3KqB64uRfmhUW6cbprwbTh8ndQStZJDMMZSFSl+0LY3V1rbJi3H4o7Kg9bq9y/r9djVur1c7bbZq3/HYotVnJ0G+7i+r1d0UEpUNkwhmcK2lDBT01dMr3Qav1OpH8KdBWmyPj6ObS0ztoXjVuhQ1Nz0zXlZ5B7T7zPEfVLxE0D70OKQ5WlbGwRakwr0veS+W+TR3OL/9upzhmJZnMf9eppnmEZzWpua2HqOO0uMnX6XCc7hXOBg3jiZY2oFV3IMyogZlRpWix1JkIJydM1OnhlgQiJnLLGH4e0JfKXGk5GQIDAQAB"
    
    /**
     * This is the license checker code. Feel free to create your own implementation or
     * leave it as it is.
     * Anyways, keep the 'destroyChecker()' as the very first line of this code block
     * Return null to disable license check
     */
    override fun getLicenseChecker():PiracyChecker? {
        destroyChecker() // Important
        if (BuildConfig.DEBUG) return null
        return super.getLicenseChecker()
    }
}