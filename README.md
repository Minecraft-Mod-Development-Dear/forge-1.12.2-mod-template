# Forge 1.12.2 Mod Template

Minecraft-Mod-Development-Dear organization template for Minecraft Forge 1.12.2 mods.

## After creating a repository from this template

1. Rename `rootProject.name` in `settings.gradle`.
2. Update `group`, `archivesBaseName`, and `version` in `build.gradle`.
3. Rename the Java package under `src/main/java/com/example/modtemplate`.
4. Update `modid`, `name`, and metadata in `src/main/resources/mcmod.info`.
5. Update asset namespace folders under `src/main/resources/assets/modtemplate`.
6. Keep reusable GitHub Actions workflows centralized in `Minecraft-Mod-Development-Dear/.github`.

## Build

```bash
gradle --no-daemon build
```

GitHub Actions uses the organization reusable CI workflow and publishes releases through the organization reusable release workflow.