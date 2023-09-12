# DetektForbiddenMethodCallDefaultInterfaceDemo is a demo project for [detekt/issues/6474](https://github.com/detekt/detekt/issues/6474)

## Note
This revision of the sample project contains a patched version of detekt which fixes the issue.
The patch includes the following PRs:
- https://github.com/detekt/detekt/pull/6475
- https://github.com/detekt/detekt/pull/6478

To reproduce the issue, either check out the revision without the patch: 
```
git checkout original-sample-project-before-fix
```

or open `pom.xml` and remove the following lines:

```
<scope>system</scope>
<systemPath>${project.basedir}/detekt-cli-1.23.1-all.jar</systemPath>
```

## Steps to reproduce:
- Clone this project
- Run detekt with `mvn antrun:run@detekt`
- Detekt will flag the call to `.map` and thus fail the build.
- Then go into `detekt-config.yml` and remove lines 39 and 40
- Run detekt again
- The build will succeed (which it shouldn't)
