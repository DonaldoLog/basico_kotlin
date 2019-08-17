package model

class Camera {

    private var isOn: Boolean = false
    private var resolution: Int = 640
    private var hdr: Boolean = false
    private var nightMode: Boolean  = false

    fun setHdr(onoff: Boolean){
        this.hdr = onoff
    }

    fun getHdr(): Boolean{
        return this.hdr
    }

    fun setNightMode(onoff: Boolean){
        this.nightMode = onoff
    }

    fun getNightMode():Boolean {
        return this.nightMode
    }

    fun setResolution(resolution: Int){
        this.resolution = resolution
    }

    fun getResolution(): Int{
        return  this.resolution
    }


    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }

    fun getCameraStatus(): String {
        return if (isOn) "Camera is turned" else "Camera is not turned"
    }

    fun setCameraStatus(onoff: Boolean){
        isOn = onoff
    }
}