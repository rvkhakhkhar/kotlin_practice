package com.ravi.chapter7

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class Book(val author: String) {
    val index by lazy { listOf("Introduction", "Chapter-1") }
}

open class PropertyChangeAware {
    protected val changeSupport = PropertyChangeSupport(this)

    fun addPropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(listener)
    }
}

class ObservableProperty<T>(
    val propName: String, var propValue: T,
    val changeSupport: PropertyChangeSupport
) {
    fun getValue(): T = propValue
    fun setValue(newValue: T) {
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(propName, oldValue, newValue)
    }
}

class ObserveProperty(var propValue: String, val changeSupport: PropertyChangeSupport) {
    operator fun getValue(p: Lamp, prop: KProperty<*>): String = propValue
    operator fun setValue(p: Lamp, prop: KProperty<*>, newValue: String) {
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
}


class Lamp(color: String, val bulbColor: String) : PropertyChangeAware() {
    private val observer = {
        prop: KProperty<*>, oldValue: String, newValue: String -> changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
    var color: String by Delegates.observable(color, observer)
}

fun main(args: Array<String>) {
    val p = Lamp("white", "yellow")
    p.addPropertyChangeListener(PropertyChangeListener { event ->
        println("Property ${event.propertyName} changed from ${event.oldValue} to ${event.newValue}")
    })
    p.color = "grey"

    val argument: String? = "hello"

    argument?.let {
        println(argument)
    }
}