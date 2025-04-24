package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraSlitheringWaterBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMurex extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer snail;
    private final AdvancedModelRenderer foot;
    private final AdvancedModelRenderer slope;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer slope2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer lefteyestalk;
    private final AdvancedModelRenderer righteyestalk;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;

    public ModelMurex() {
        this.textureWidth = 45;
        this.textureHeight = 45;

        this.snail = new AdvancedModelRenderer(this);
        this.snail.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.foot = new AdvancedModelRenderer(this);
        this.foot.setRotationPoint(1.0F, -1.5F, -3.25F);
        this.snail.addChild(foot);
        this.foot.cubeList.add(new ModelBox(foot, 17, 15, -3.0F, -0.5F, 0.25F, 4, 1, 4, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 15, -3.0F, 0.5F, -1.75F, 4, 1, 9, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 28, 15, -4.0F, 0.5F, -0.75F, 1, 1, 5, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 28, 27, -2.5F, -2.5F, 0.75F, 3, 2, 3, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 21, -2.0F, -3.5F, 1.25F, 2, 1, 2, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 27, 1, 1.0F, 0.5F, -0.75F, 1, 1, 5, 0.0F, false));

        this.slope = new AdvancedModelRenderer(this);
        this.slope.setRotationPoint(-1.0F, -1.0F, 1.0F);
        this.foot.addChild(slope);
        this.setRotateAngle(slope, 0.3927F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, 0.5412F, -1.3066F);
        this.slope.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.6545F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 32, -1.5F, -0.6F, -1.45F, 1, 1, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 21, -2.0F, -0.6F, 0.55F, 2, 1, 2, 0.0F, false));

        this.slope2 = new AdvancedModelRenderer(this);
        this.slope2.setRotationPoint(-1.0F, -1.0F, 3.5F);
        this.foot.addChild(slope2);
        this.setRotateAngle(slope2, -0.3927F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, 0.5412F, 1.3066F);
        this.slope2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.6109F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -2.0F, -0.5F, -2.55F, 2, 1, 4, 0.0F, false));

        this.lefteyestalk = new AdvancedModelRenderer(this);
        this.lefteyestalk.setRotationPoint(0.0F, -1.75F, 0.25F);
        this.foot.addChild(lefteyestalk);
        this.lefteyestalk.cubeList.add(new ModelBox(lefteyestalk, 6, 0, 0.0F, -0.05F, -1.5F, 3, 0, 2, 0.0F, false));

        this.righteyestalk = new AdvancedModelRenderer(this);
        this.righteyestalk.setRotationPoint(-2.0F, -1.75F, 0.25F);
        this.foot.addChild(righteyestalk);
        this.righteyestalk.cubeList.add(new ModelBox(righteyestalk, 6, 2, -3.0F, -0.05F, -1.5F, 3, 0, 2, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(-14.05F, -3.75F, -1.5F);
        this.snail.addChild(shell);
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, 14.0F, -2.0F, -14.5F, 1, 1, 14, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 4, 14, 14.5F, -7.0F, -2.75F, 0, 5, 1, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 6, 14, 14.5F, -6.5F, -1.5F, 0, 4, 1, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, 14.5F, -6.0F, -0.25F, 0, 3, 1, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 26, 26, 14.5F, -5.25F, 1.0F, 0, 2, 1, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 26, 26, 14.5F, -5.05F, 2.1F, 0, 2, 1, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 17, 14.2F, -7.65F, 2.25F, 0, 6, 8, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 12, 3, 14.5F, -6.75F, -4.0F, 0, 5, 1, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 10, 4, 14.5F, -7.0F, -5.25F, 0, 5, 1, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 6, 18, 14.5F, -6.0F, -6.5F, 0, 4, 1, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 2, 0, 14.5F, -5.0F, -7.75F, 0, 3, 1, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 28, 26, 14.5F, -4.0F, -9.0F, 0, 2, 1, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 4, 19, 14.5F, -3.0F, -10.25F, 0, 1, 1, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 16, 27, 12.5F, -4.0F, 1.5F, 4, 4, 2, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 31, 12.75F, -3.5F, 3.5F, 3, 3, 2, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 17, 20, 13.25F, -3.0F, 5.0F, 2, 2, 2, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 17, 17, 13.75F, -2.4F, 6.75F, 1, 1, 1, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 16, 0, 11.15F, -3.4F, -0.7F, 5, 3, 3, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 10, 32, 13.4841F, -2.5F, -1.6409F, 2, 2, 1, 0.05F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(11.2F, -1.5F, -0.5F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.829F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 21, 0.05F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-13.75F, -1.5F, 6.25F);
        this.shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 2.0508F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -13.15F, -30.2F, -0.75F, 0, 5, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(13.75F, -0.5F, 6.25F);
        this.shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2182F, 0.0F, -2.0508F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 13, 1.3F, -8.0F, -6.3F, 0, 6, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(13.75F, -1.5F, 6.25F);
        this.shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -2.0508F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 0, 0.0F, -6.0F, -4.0F, 0, 6, 8, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(14.5F, -4.25F, 4.75F);
        this.shell.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.5236F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 26, -0.5F, -1.0F, -0.25F, 0, 2, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(14.0F, -1.0F, -6.625F);
        this.shell.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.3491F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 12, -3.0F, 0.0F, -3.625F, 3, 0, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 16, -2.0F, 0.0F, -4.875F, 2, 0, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 29, 14, -4.0F, 0.0F, -2.375F, 4, 0, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 6, -5.0F, 0.0F, -1.125F, 5, 0, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 10, -6.0F, 0.0F, 0.125F, 6, 0, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 11, -6.0F, 0.0F, 1.375F, 6, 0, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 9, -3.5F, -0.5F, 10.375F, 3, 0, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 9, -5.5F, -1.0F, 7.875F, 3, 0, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 13, -5.0F, 0.0F, 3.875F, 5, 0, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 12, -6.0F, 0.0F, 2.625F, 6, 0, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(17.1959F, -0.2387F, 2.4136F);
        this.shell.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0436F, 0.48F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 25, -1.75F, 0.0F, 2.0F, 3, 0, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 26, -1.75F, 0.0F, 0.75F, 3, 0, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 29, 24, -1.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(15.0F, -1.1F, -2.25F);
        this.shell.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.1745F, 0.48F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 7, 31, 0.0F, -0.25F, 3.25F, 3, 0, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 31, 7, -0.25F, -0.25F, 2.0F, 3, 0, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 31, 8, -0.75F, 0.0F, 0.75F, 3, 0, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 31, 10, -1.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(15.0F, -1.1F, -3.5F);
        this.shell.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.1309F, 0.48F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 23, 7, -1.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(15.0F, -1.1F, -4.75F);
        this.shell.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.1309F, 0.48F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 0, -1.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(15.0F, -1.1F, -6.0F);
        this.shell.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.2182F, 0.48F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 31, 11, -1.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(15.0F, -1.1F, -7.25F);
        this.shell.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.2182F, 0.48F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 15, -1.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(12.1206F, -0.316F, -1.25F);
        this.shell.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.3054F, -0.3491F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 15, 7, -1.5F, -0.3F, -0.4F, 4, 0, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(14.5F, -1.0F, -5.5F);
        this.shell.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.7418F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 12, 8, 0.0F, 0.0F, 3.25F, 0, 1, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 16, 0, 0.0F, 0.0F, 2.0F, 0, 1, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 17, 19, 0.0F, 0.0F, 0.75F, 0, 2, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 20, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 23, 19, 0.0F, 0.0F, -1.75F, 0, 2, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 16, 26, 0.0F, 0.0F, -3.0F, 0, 2, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 11, 12, 0.0F, 0.0F, -4.25F, 0, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.body.render(f5 * 0.2F);
        snail.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.snail.offsetY = -0.6F;
        this.snail.offsetX = -0.4F;
        this.snail.offsetZ = 2.0F;
        this.snail.rotateAngleY = (float)Math.toRadians(120);
        this.snail.rotateAngleX = (float)Math.toRadians(1);
        this.snail.rotateAngleZ = (float)Math.toRadians(0);
        this.snail.scaleChildren = true;
        float scaler = 3.2F;
        this.snail.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(snail, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.snail.render(f);
        //Reset rotations, positions and sizing:
        this.snail.setScale(1.0F, 1.0F, 1.0F);
        this.snail.scaleChildren = false;
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
        //this.snail.offsetY = 0.122F;

        this.swing(lefteyestalk, 0.22F, 0.15F, false, 0, 0.15F, f2, 0.8F);
        this.swing(righteyestalk, 0.22F, 0.15F, true, 0, 0.15F, f2, 0.8F);
        this.flap(lefteyestalk, 0.22F, 0.15F, false, 0, 0.15F, f2, 0.8F);
        this.flap(righteyestalk, 0.22F, 0.15F, true, 0, 0.15F, f2, 0.8F);

        this.lefteyestalk.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.lefteyestalk.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;
        this.righteyestalk.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.righteyestalk.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;

        EntityPrehistoricFloraSlitheringWaterBase ee = (EntityPrehistoricFloraSlitheringWaterBase) e;
        this.foot.scaleChildren = true;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.1F) + 1F;
        this.foot.setScaleZ(scaler);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.1F);
        this.foot.setScaleX(scaler2 * 0.7F);
        this.foot.scaleChildren = false;
    }
}
