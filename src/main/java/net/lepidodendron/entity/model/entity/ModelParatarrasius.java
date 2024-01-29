package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelParatarrasius extends AdvancedModelBase {
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer finR;
    private final AdvancedModelRenderer finL;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer bone5;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer bone6;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer bone7;

    public ModelParatarrasius() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(0.5F, 19.0F, -3.0F);
        this.bone3.cubeList.add(new ModelBox(bone3, 12, 5, -1.5F, -2.3F, -3.0F, 2, 4, 6, 0.0F, false));
        this.bone3.cubeList.add(new ModelBox(bone3, 22, 11, -0.5F, -5.0F, -3.0F, 0, 3, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.3F, 2.0F);
        this.bone3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2007F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 16, -1.5F, 0.0F, -5.0F, 2, 1, 5, -0.01F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.bone3.addChild(bone);
        this.bone.cubeList.add(new ModelBox(bone, 24, 28, -1.5F, -1.0F, -3.5F, 2, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.0F, -2.5F);
        this.bone.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.7854F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.3F, -0.5F);
        this.bone.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.4538F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 0, -1.5F, 0.0F, -3.0F, 2, 2, 3, -0.01F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(-0.5F, 1.0F, -0.5F);
        this.bone.addChild(bone2);
        this.bone2.cubeList.add(new ModelBox(bone2, 30, 8, -1.0F, -0.3F, -3.0F, 2, 1, 3, -0.01F, false));

        this.finR = new AdvancedModelRenderer(this);
        this.finR.setRotationPoint(-1.5F, -0.5F, -2.0F);
        this.bone3.addChild(finR);
        this.setRotateAngle(finR, 0.0F, -0.3491F, 0.0F);
        this.finR.cubeList.add(new ModelBox(finR, 0, 0, 0.0F, -1.5F, 0.0F, 0, 3, 3, 0.0F, true));

        this.finL = new AdvancedModelRenderer(this);
        this.finL.setRotationPoint(0.5F, -0.5F, -2.0F);
        this.bone3.addChild(finL);
        this.setRotateAngle(finL, 0.0F, 0.3491F, 0.0F);
        this.finL.cubeList.add(new ModelBox(finL, 0, 0, 0.0F, -1.5F, 0.0F, 0, 3, 3, 0.0F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(-0.5F, -0.3F, 2.0F);
        this.bone3.addChild(bone4);
        this.bone4.cubeList.add(new ModelBox(bone4, 0, 0, -1.0F, -2.0F, 0.0F, 2, 4, 7, 0.01F, false));
        this.bone4.cubeList.add(new ModelBox(bone4, 12, 17, 0.0F, -4.7F, 0.0F, 0, 3, 7, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -3.0F, 0.0F);
        this.bone4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1431F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 11, -1.5F, 0.0F, 0.0F, 2, 1, 7, 0.0F, false));

        this.bone5 = new AdvancedModelRenderer(this);
        this.bone5.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.bone4.addChild(bone5);
        this.bone5.cubeList.add(new ModelBox(bone5, 12, 15, -1.0F, -1.2F, -1.0F, 2, 3, 6, 0.0F, false));
        this.bone5.cubeList.add(new ModelBox(bone5, 10, 22, 0.0F, -4.7F, 0.0F, 0, 5, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -2.0F, 0.0F);
        this.bone5.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1571F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 28, -1.5F, 0.0F, 0.0F, 2, 1, 5, -0.01F, false));

        this.bone6 = new AdvancedModelRenderer(this);
        this.bone6.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.bone5.addChild(bone6);
        this.bone6.cubeList.add(new ModelBox(bone6, 22, 0, -1.0F, -0.4F, -1.0F, 2, 2, 6, -0.01F, false));
        this.bone6.cubeList.add(new ModelBox(bone6, 0, 20, 0.0F, -3.7F, 0.0F, 0, 7, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -1.2F, 0.0F);
        this.bone6.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1571F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 23, 22, -1.5F, 0.0F, 0.0F, 2, 1, 5, -0.02F, false));

        this.bone7 = new AdvancedModelRenderer(this);
        this.bone7.setRotationPoint(0.0F, 0.25F, 5.0F);
        this.bone6.addChild(bone7);
        this.bone7.cubeList.add(new ModelBox(bone7, 22, 9, -0.5F, -0.05F, -1.0F, 1, 1, 6, 0.0F, false));
        this.bone7.cubeList.add(new ModelBox(bone7, 0, 13, 0.0F, -2.95F, 0.0F, 0, 6, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone3.render(f5 * 0.1F);
    }
    public void renderStaticWall(float f) {
        this.bone3.rotateAngleY = (float) Math.toRadians(90);
        this.bone3.offsetY = -0.2F;
        this.bone3.offsetX = -0.12F;
        this.bone3.offsetZ = -0.6F;
        this.bone3.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(bone3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(bone, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(bone2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(bone4, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(bone5, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(bone6, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(bone7, 0.0F, -0.2F, 0.0F);
        this.bone3.offsetY = 0.06F;
        this.bone3.offsetZ = -0.03F;
        this.bone3.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.bone3.offsetY = 1.35F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.bone4, this.bone5, this.bone6, this.bone7};
        float speed = 0.385F;
        if (!e.isInWater()) {
            speed = 0.715F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.03F, -2, f2, 1);
            this.chainSwing(fishTail, speed, 0.15F, -1.85, f2, 0.95F);
            this.swing(finL, speed*1.8F, 0.45F, false, 0, 0, f2, 1);
            this.swing(finR, speed*1.8F, 0.45F, false, 0, 0, f2, 1);
            this.walk(bone2, speed*0.5F, (float)Math.toRadians(20), true, 0, 0, f2, 1);
            this.swing(bone3, speed, 0.18F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.bone3.rotateAngleZ = (float) Math.toRadians(90);
                this.bone3.offsetY = 1.35F;
                this.bob(bone3, -speed, 2F, false, f2, 1);
            }
        }
    }
}
