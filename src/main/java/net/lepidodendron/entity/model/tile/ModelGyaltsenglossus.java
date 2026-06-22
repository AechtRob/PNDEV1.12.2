package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelGyaltsenglossus extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer stem;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer proboscis;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer frill1;
    private final AdvancedModelRenderer frill2;
    private final AdvancedModelRenderer frill3;
    private final AdvancedModelRenderer frill4;
    private final AdvancedModelRenderer frill5;
    private final AdvancedModelRenderer frill6;

    public ModelGyaltsenglossus() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 7, 0, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

        this.stem = new AdvancedModelRenderer(this);
        this.stem.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.main.addChild(stem);
        this.stem.cubeList.add(new ModelBox(stem, 9, 6, -0.5F, -1.75F, -0.5F, 1, 2, 1, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.stem.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 5, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 10, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.55F, 1.0F);
        this.body2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.1781F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 4, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.3956F, -1.6727F, 0.892F);
        this.body2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.2722F, 0.4162F, -0.1048F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 7, 4, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.3956F, -1.6727F, 0.892F);
        this.body2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.2722F, -0.4162F, 0.1048F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 7, 4, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.proboscis = new AdvancedModelRenderer(this);
        this.proboscis.setRotationPoint(0.0F, -1.65F, -0.65F);
        this.body2.addChild(proboscis);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.proboscis.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.7854F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 11, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.frill1 = new AdvancedModelRenderer(this);
        this.frill1.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body2.addChild(frill1);
        this.frill1.cubeList.add(new ModelBox(frill1, 0, -3, 0.0F, -4.0F, -3.0F, 0, 4, 3, 0.0F, false));

        this.frill2 = new AdvancedModelRenderer(this);
        this.frill2.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body2.addChild(frill2);
        this.setRotateAngle(frill2, 0.0F, -1.0472F, 0.0F);
        this.frill2.cubeList.add(new ModelBox(frill2, 0, -3, 0.0F, -4.0F, -3.0F, 0, 4, 3, 0.0F, false));

        this.frill3 = new AdvancedModelRenderer(this);
        this.frill3.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body2.addChild(frill3);
        this.setRotateAngle(frill3, 0.0F, -2.0944F, 0.0F);
        this.frill3.cubeList.add(new ModelBox(frill3, 0, -3, 0.0F, -4.0F, -3.0F, 0, 4, 3, 0.0F, false));

        this.frill4 = new AdvancedModelRenderer(this);
        this.frill4.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body2.addChild(frill4);
        this.setRotateAngle(frill4, 0.0F, 3.1416F, 0.0F);
        this.frill4.cubeList.add(new ModelBox(frill4, 0, -3, 0.0F, -4.0F, -3.0F, 0, 4, 3, 0.0F, false));

        this.frill5 = new AdvancedModelRenderer(this);
        this.frill5.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body2.addChild(frill5);
        this.setRotateAngle(frill5, 0.0F, 2.0944F, 0.0F);
        this.frill5.cubeList.add(new ModelBox(frill5, 0, -3, 0.0F, -4.0F, -3.0F, 0, 4, 3, 0.0F, false));

        this.frill6 = new AdvancedModelRenderer(this);
        this.frill6.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body2.addChild(frill6);
        this.setRotateAngle(frill6, 0.0F, 1.0472F, 0.0F);
        this.frill6.cubeList.add(new ModelBox(frill6, 0, -3, 0.0F, -4.0F, -3.0F, 0, 4, 3, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();

        AdvancedModelRenderer[] stem = {this.main,this.stem};
        float speed = 0.051F;
        this.chainWave(stem, speed, 0.08F, 1, f, 0.32F);
        this.chainFlap(stem, speed, 0.08F, 1, f, 0.32F);
        this.walk(frill1, 0.12F, -0.3F, false, 0F, -0.2F, f, 1f);
        this.walk(frill2, 0.12F, -0.3F, false, 0.5F, -0.2F, f, 1f);
        this.walk(frill3, 0.12F, -0.3F, false, 0F, -0.2F, f, 1f);
        this.walk(frill4, 0.12F, -0.3F, false, 0.5F, -0.2F, f, 1f);
        this.walk(frill5, 0.12F, -0.3F, false, 0F, -0.2F, f, 1f);
        this.walk(frill6, 0.12F, -0.3F, false, 0.5F, -0.2F, f, 1f);

        this.main.render(0.1f);
    }

    public void renderAllSide(float f) {
        this.resetToDefaultPose();

        this.setRotateAngle(main, -0.0F, 0.0F, 0.0F);
        this.setRotateAngle(stem, -0.0F, 0.0F, 0.0F);

        AdvancedModelRenderer[] stem = {this.main,this.stem};
        float speed = 0.051F;
        this.chainWave(stem, speed, 0.08F, 1, f, 0.32F);
        this.chainFlap(stem, speed, 0.08F, 1, f, 0.32F);
        this.walk(frill1, 0.12F, -0.3F, false, 0F, -0.2F, f, 1f);
        this.walk(frill2, 0.12F, -0.3F, false, 0.5F, -0.2F, f, 1f);
        this.walk(frill3, 0.12F, -0.3F, false, 0F, -0.2F, f, 1f);
        this.walk(frill4, 0.12F, -0.3F, false, 0.5F, -0.2F, f, 1f);
        this.walk(frill5, 0.12F, -0.3F, false, 0F, -0.2F, f, 1f);
        this.walk(frill6, 0.12F, -0.3F, false, 0.5F, -0.2F, f, 1f);

        this.main.render(0.1f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
