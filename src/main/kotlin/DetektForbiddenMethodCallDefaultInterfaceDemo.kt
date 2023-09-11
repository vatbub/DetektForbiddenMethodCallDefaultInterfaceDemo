import javafx.beans.property.SimpleObjectProperty

class DetektForbiddenMethodCallDefaultInterfaceDemo {
    val objectProperty = SimpleObjectProperty("Hello there")
    val mappedProperty = objectProperty.map { it.uppercase() }
}
