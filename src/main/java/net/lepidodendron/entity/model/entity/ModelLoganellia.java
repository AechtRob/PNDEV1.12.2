package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelLoganellia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;

    public ModelLoganellia() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 21.9014F, -4.6058F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -1.1764F, -0.5692F, 5, 3, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 25, -1.5F, -0.1514F, -3.3942F, 3, 1, 3, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -0.2014F, -3.3942F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3272F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 24, -1.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, 0.8486F, -3.3942F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3316F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 28, -0.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.975F, 0.0986F, -1.1442F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.6283F, -0.2618F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 24, 0.0F, 0.0F, 1.0F, 3, 0, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.975F, 0.0986F, -1.1442F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.6283F, 0.2618F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 24, -3.0F, 0.0F, 1.0F, 3, 0, 4, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.5F, -0.1514F, -3.3442F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.3491F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 22, -0.9F, 0.0F, 0.7F, 1, 1, 1, -0.01F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 11, -1.0F, 0.0F, -0.05F, 1, 1, 3, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.5F, -0.1514F, -3.3442F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.3491F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 22, -0.1F, 0.0F, 0.7F, 1, 1, 1, -0.01F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 11, 0.0F, 0.0F, -0.05F, 1, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.8236F, -0.5692F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 7, -2.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.1764F, -0.5692F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1963F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 14, -2.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.6514F, 3.4808F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 16, 12, -2.0F, -0.8F, -0.5F, 4, 3, 3, -0.01F, false));
        this.tail.cubeList.add(new ModelBox(tail, 28, 18, -1.5F, -1.225F, -0.5F, 3, 1, 3, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 24, 28, -1.5F, 1.775F, -0.55F, 3, 1, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.35F, 2.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 18, 0, -1.5F, -1.2F, -0.25F, 3, 3, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.875F, 0.625F);
        this.tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 29, -1.0F, -0.5F, -1.0F, 2, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.75F, 0.5F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 19, 0.0F, -1.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.025F, 0.8F);
        this.tail2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 32, 0.0F, -1.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.95F, 0.525F);
        this.tail2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1265F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 30, 0, -1.0F, -0.5F, -1.0F, 2, 1, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 2.75F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 16, 18, -1.0F, -0.7F, -1.0F, 2, 2, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.3719F, 4.7795F);
        this.tail3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1309F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 30, 4, 0.5F, -1.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.8F, 3.75F);
        this.tail3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2182F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 19, -0.5F, 0.0F, -1.0F, 1, 1, 5, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.5F, 3.4F);
        this.tail3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.5236F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 28, 22, -0.5F, -1.0F, -0.5F, 1, 1, 1, -0.01F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 7, -0.5F, 0.0F, -1.0F, 1, 1, 6, 0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.7F, 1.45F);
        this.tail3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3054F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 15, -1.0F, 0.0F, -2.0F, 2, 1, 2, -0.01F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -3.2F;
        this.main.offsetX = 1.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 2.4F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(tail, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.12F, 0.0F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetZ = -0.08F;
        this.main.offsetY = -0.22F;
        this.main.offsetX = -0.05F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(cube_r1, 0.3272F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.1265F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0F, -0.6283F, -0.2618F);
        this.setRotateAngle(cube_r4, 0.0F, 0.6283F, 0.2618F);
        this.setRotateAngle(cube_r5, 0.0F, 0.3491F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0F, -0.3491F, 0.0F);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.1963F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(main, 0.637F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.0779F, -0.0524F, -0.0131F);
        this.setRotateAngle(tail2, -0.0995F, -0.092F, -0.0066F);
        this.setRotateAngle(tail3, 0.0F, 0.3185F, 0.0F);
        this.main.offsetY = -0.35F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.main.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);


            this.swing(main, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                //this.Sclerodus.offsetY = 0.58F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
