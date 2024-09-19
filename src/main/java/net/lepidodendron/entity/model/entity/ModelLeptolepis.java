package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelLeptolepis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cheek;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail4;

    public ModelLeptolepis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 28.0F, -0.05F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -8.75F, -1.925F, 3, 5, 6, 0.01F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(1.55F, -4.0F, -1.8F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, -0.553F, 0.4968F, -0.2861F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 0, 18, 0.0F, -2.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-1.55F, -4.0F, -1.8F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, -0.553F, -0.4968F, 0.2861F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 0, 18, 0.0F, -2.0F, 0.0F, 0, 2, 4, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 0, 0.075F, -7.55F, -5.825F, 2, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -1.075F, -7.55F, -5.825F, 2, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.7517F, -1.9442F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2313F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 15, -1.0F, -2.0F, -2.975F, 3, 2, 3, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -6.6767F, -5.4192F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3403F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 11, -1.0F, 0.05F, -1.75F, 3, 1, 6, 0.002F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -8.4F, -3.9F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2967F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 25, -1.0F, 0.9733F, -1.9942F, 3, 2, 2, -0.01F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 0, -1.0F, -0.0017F, -3.9942F, 3, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -8.75F, -1.925F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 25, -1.0F, 0.0F, -2.0F, 3, 3, 2, 0.001F, false));

        this.cheek = new AdvancedModelRenderer(this);
        this.cheek.setRotationPoint(1.025F, -6.2667F, -7.4135F);
        this.head.addChild(cheek);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cheek.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3403F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 2, 1.0F, -1.0022F, -0.007F, 0, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -5.2843F, -4.6201F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.2075F, -0.2742F);
        this.jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 20, -1.0F, -1.375F, -2.9F, 3, 1, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -7.062F, 3.636F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, 0.0F, 0.0436F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 15, 8, -1.5F, -1.188F, 0.114F, 3, 4, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.688F, 1.614F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 6, 20, 0.0F, -2.55F, -0.475F, 0, 3, 4, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 0, -1.5F, 0.2F, -1.475F, 3, 1, 3, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 3.312F, 0.114F);
        this.tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0698F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 21, 21, -1.5F, -1.0F, 0.0F, 3, 1, 3, -0.01F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(1.5F, 3.187F, 0.364F);
        this.tail.addChild(backleftfin);
        this.setRotateAngle(backleftfin, -0.6889F, 0.204F, -0.1653F);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 0, 0, 0.025F, -2.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-1.5F, 3.187F, 0.364F);
        this.tail.addChild(backrightfin);
        this.setRotateAngle(backrightfin, -0.6889F, -0.204F, 0.1653F);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 0, 0, -0.025F, -2.0F, 0.0F, 0, 2, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.5716F, 2.631F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, 0.0436F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 24, 4, -1.0F, -2.0096F, 0.233F, 2, 3, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.2346F, 3.108F);
        this.tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2007F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 19, 29, -1.0F, -0.0321F, -3.0019F, 2, 1, 3, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.1521F, 3.0763F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3054F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 12, 0.0F, -1.375F, -1.375F, 0, 2, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.2404F, 0.233F);
        this.tail2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 29, 16, -1.0F, -0.725F, -0.05F, 2, 1, 3, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.5381F, 2.8239F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, 0.0873F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 24, -0.5F, -0.9715F, 0.1591F, 1, 2, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.6715F, 0.0591F);
        this.tail3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1876F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 24, 11, -0.5F, -0.0548F, -0.0907F, 1, 1, 4, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.6285F, 0.1591F);
        this.tail3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1484F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 23, 16, -0.5F, -1.0F, -0.075F, 1, 1, 4, -0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0285F, 4.1591F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 30, 0.0F, -2.5F, 0.0F, 0, 6, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.05F;
        this.main.offsetY = -0.23F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(tail, 0.0F, -0.3927F, 0.0F);
        this.setRotateAngle(jaw, -0.3491F, 0.0F, 0.0F);
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.6F;
        this.main.offsetX = -0.04F;
        this.main.offsetZ = 0.0F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {

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
        this.main.offsetY = 0F;
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.2F, -3, f2, 1);
            this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(frontleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(frontleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(frontrightfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(frontrightfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(backleftfin, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(backleftfin, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.walk(backrightfin, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(backrightfin, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.25F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
