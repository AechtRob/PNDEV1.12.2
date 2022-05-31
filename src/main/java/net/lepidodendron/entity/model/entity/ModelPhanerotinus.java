package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPhanerotinus extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leg3;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer leg;
    private final AdvancedModelRenderer leg2;
    private final AdvancedModelRenderer tentacleL;
    private final AdvancedModelRenderer tentacleL2;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;

    public ModelPhanerotinus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, -2.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 36, -1.5F, -2.01F, -1.25F, 3, 2, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 11, 36, -1.5F, -3.01F, -0.75F, 3, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 33, 37, -2.0F, -1.0F, -2.75F, 4, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.4363F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.5F, -2.5F, -3.25F, 1, 1, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 3, -1.0F, -2.5F, -1.25F, 2, 1, 1, 0.0F, false));

        this.leg3 = new AdvancedModelRenderer(this);
        this.leg3.setRotationPoint(2.0F, 0.0F, 1.0F);
        this.body.addChild(leg3);
        this.leg3.cubeList.add(new ModelBox(leg3, 34, 12, -1.0F, -0.99F, -3.25F, 2, 1, 6, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(bone);


        this.leg = new AdvancedModelRenderer(this);
        this.leg.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body.addChild(leg);
        this.leg.cubeList.add(new ModelBox(leg, 21, 37, -2.0F, -1.0F, -0.25F, 4, 1, 2, 0.0F, false));

        this.leg2 = new AdvancedModelRenderer(this);
        this.leg2.setRotationPoint(-2.0F, 0.0F, 1.0F);
        this.body.addChild(leg2);
        this.leg2.cubeList.add(new ModelBox(leg2, 30, 30, -1.0F, -0.99F, -3.25F, 2, 1, 6, 0.0F, false));

        this.tentacleL = new AdvancedModelRenderer(this);
        this.tentacleL.setRotationPoint(1.0F, -1.75F, -2.0F);
        this.body.addChild(tentacleL);
        this.tentacleL.cubeList.add(new ModelBox(tentacleL, 12, 27, -0.5F, 0.0F, -1.75F, 4, 0, 2, 0.0F, false));

        this.tentacleL2 = new AdvancedModelRenderer(this);
        this.tentacleL2.setRotationPoint(-1.0F, -1.75F, -2.0F);
        this.body.addChild(tentacleL2);
        this.tentacleL2.cubeList.add(new ModelBox(tentacleL2, 18, 9, -3.5F, 0.0F, -1.75F, 4, 0, 2, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, -2.0F, 0.5F);
        this.body.addChild(shell);
        this.setRotateAngle(shell, 0.1745F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 18, -2.0F, -2.0F, 0.0F, 4, 3, 6, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 22, 12, -7.0F, -0.5F, 0.0F, 5, 0, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(15.0F, 0.0F, 3.5F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -2.0071F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 21, -2.7515F, -0.51F, -0.32F, 3, 0, 7, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 27, 6.7485F, -0.51F, 0.68F, 1, 0, 6, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.2515F, -1.51F, -0.32F, 7, 2, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(9.0F, 0.0F, 0.75F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -1.9199F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 19, -0.2948F, -0.51F, 0.08F, 7, 0, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(15.0F, 0.0F, 10.0F);
        this.shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -3.0543F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 9, -3.1515F, -0.5F, -0.07F, 3, 0, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(15.0F, 0.0F, 9.5F);
        this.shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 3.1416F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 22, -0.1515F, -1.5F, -0.57F, 2, 2, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(11.0F, 0.0F, 14.5F);
        this.shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 2.3562F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 25, 0, -4.0443F, -0.5F, 0.044F, 4, 0, 6, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 27, -0.0443F, -2.0F, 0.044F, 3, 3, 6, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(5.0F, 0.0F, 14.5F);
        this.shell.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 1.5272F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 0, -4.7826F, -0.51F, 0.0383F, 5, 0, 6, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 27, 0.2174F, -2.01F, 0.0383F, 3, 3, 6, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.25F, 0.0F, 11.5F);
        this.shell.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 1.0036F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 21, -4.992F, -0.5F, 0.078F, 5, 0, 6, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 9, 0.008F, -2.0F, 0.078F, 4, 3, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.5F, 0.0F, 6.0F);
        this.shell.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.2618F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 22, 6, -4.5F, -0.51F, 0.0F, 5, 0, 6, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 12, 0.5F, -2.01F, 0.0F, 4, 3, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.body.render(f5 * 0.2F);
        body.render(f5 * 0.215F);
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
        this.body.offsetY = 1.16F;

        this.swing(tentacleL, 0.2F, 0.1F, true, 0, 0.15F, f2, 0.8F);
        this.swing(tentacleL2, 0.2F, 0.1F, false, 0, 0.15F, f2, 0.8F);
        this.walk(tentacleL, 0.2F, 0.1F, false, 0, 0.15F, f2, 0.8F);
        this.walk(tentacleL2, 0.2F, 0.1F, true, 0, 0.15F, f2, 0.8F);
        this.walk(shell, 0.1F, 0.08F, true, 0, -0.04F, f2, 1.0F);
        this.swing(shell, 0.125F, 0.05F, true, 0, -0.04F, f2, 1.0F);

    }
}
