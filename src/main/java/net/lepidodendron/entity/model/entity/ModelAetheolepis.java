package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelAetheolepis extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer frontrightfin;

    public ModelAetheolepis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.5F, 24.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.575F, -10.0F, -5.75F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 35, 29, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 35, 29, 1.15F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.475F, -9.975F, -5.65F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 18, -1.0F, -1.0F, -1.125F, 2, 2, 2, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 18, 0.95F, -1.0F, -1.125F, 2, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -8.9792F, -0.3327F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 21, -1.5F, -3.075F, -3.6F, 4, 10, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -14.525F, -4.5F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.0036F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 14, -1.0F, -0.0056F, -5.9382F, 3, 5, 6, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 42, 0, -1.0F, 2.9944F, -7.9382F, 3, 3, 2, 0.002F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -8.6735F, -8.2022F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.6065F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -1.0F, 2.9728F, -0.0139F, 3, 2, 1, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0895F, 1.9567F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.7497F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 50, 0.5F, -0.0168F, -3.0198F, 0, 4, 3, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 0, -1.5F, -0.0168F, -0.0198F, 4, 4, 6, 0.002F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.5605F, -2.8433F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.2435F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 46, 29, -1.0F, 0.0588F, -0.0394F, 3, 5, 3, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -4.5605F, -5.3433F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.6894F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 0, -1.0F, -0.0361F, -0.0185F, 3, 4, 3, 0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -17.775F, -0.6F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.6981F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 10, -1.0F, -0.0228F, -5.0148F, 3, 5, 5, 0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -17.0F, 1.0F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 33, -1.5F, -1.0F, -1.5F, 4, 13, 3, 0.001F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.5F, -9.1299F, 3.2289F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 10, 38, 0.0F, -12.8701F, -1.2289F, 0, 9, 6, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0869F, 1.7916F);
        this.tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.6938F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 15, 7, -1.5F, -3.0F, -4.0F, 3, 6, 7, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 2.8075F, 1.9351F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.6938F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -1.0F, -2.0F, -3.85F, 3, 6, 8, -0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -8.8701F, -0.9789F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.6894F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 14, -1.0F, -0.05F, -0.15F, 3, 4, 8, -0.001F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0385F, 4.7828F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 34, 0.0F, -12.9086F, -0.0117F, 0, 13, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 4.0239F, 1.0779F);
        this.tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.6414F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 22, 45, -1.0F, -3.2427F, -3.8245F, 2, 4, 4, -0.001F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 7.5914F, 1.4883F);
        this.tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1571F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 20, 0.0F, -6.5F, -3.0F, 0, 13, 6, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -3.9086F, -0.1367F);
        this.tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.8247F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 42, 20, -1.0F, -0.1F, -0.825F, 2, 3, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.5F, 2.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 35, 25, -0.5F, -1.0F, -0.25F, 1, 2, 2, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 12, 29, -0.025F, -4.0F, 0.75F, 0, 8, 7, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -7.8919F, -5.1945F);
        this.main.addChild(jaw);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.7816F, -3.0076F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.6065F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 14, 20, -1.0F, 1.9728F, 0.7361F, 3, 1, 1, -0.002F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 26, 0, -1.0F, -0.0272F, -0.0139F, 3, 3, 1, -0.003F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -6.6331F, 0.6945F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 1.0036F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 28, 10, -1.0F, -0.0056F, -6.9382F, 3, 3, 1, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(2.5F, -6.9792F, -3.5827F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.9026F, 0.3879F, -0.2902F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 0, 0, 0.0F, 0.0F, 0.0F, 0, 4, 3, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-1.5F, -6.9792F, -3.5827F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.9026F, -0.3879F, 0.2902F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 0, 0, 0.0F, 0.0F, 0.0F, 0, 4, 3, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        //this.body.offsetX = -0.09F;
        this.main.offsetY = -0.15F;
        this.main.offsetX = -0.04F;
        this.main.render(0.01F);
    }
    public void renderStaticFloor(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.6065F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 1.7497F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 1.2435F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.6894F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(cube_r11, -0.6938F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.6938F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.6894F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.2182F, 0.0F);
        this.setRotateAngle(cube_r14, -0.6414F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, 0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, -0.8247F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(jaw, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, 0.6065F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(frontleftfin, 0.9026F, 0.3879F, -0.2902F);
        this.setRotateAngle(frontrightfin, 0.9026F, -0.3879F, 0.2902F);
        //this.body.offsetX = -0.09F;
        this.main.offsetY = -0.15F;
        this.main.offsetX = -0.04F;
        this.main.render(0.01F);
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
        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.15F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.2F, false, 0.1F, 0, f2, 1);

            this.walk(frontleftfin, (float) (speed * 0.75), 0.25F, true, 0, 0, f2, 1);
            this.swing(frontleftfin, (float) (speed * 0.75), 0.25F, true, 0, 0, f2, 1);
            this.walk(frontrightfin, (float) (speed * 0.75), 0.25F, true, 0, 0, f2, 1);
            this.swing(frontrightfin, (float) (speed * 0.75), 0.25F, true, 0, 0, f2, 1);


            this.swing(main, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.1F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
