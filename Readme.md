# DetektForbiddenMethodCallDefaultInterfaceDemo is a demo project for [detekt/issues/6474](https://github.com/detekt/detekt/issues/6474)

## Steps to reproduce:
- Clone this project
- Run detekt with `mvn antrun:run@detekt`
- Detekt will flag the call to `.map` and thus fail the build.
- Then go into `detekt-config.yml` and remove lines 592 and 593
- Run detekt again
- The build will succeed (which it shouldn't)
