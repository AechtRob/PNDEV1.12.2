package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelOstenoselache extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;

    public ModelOstenoselache() {
        this.textureWidth = 50;
        this.textureHeight = 50;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 29.0F, 6.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -8.25F, -10.0F, 3, 3, 7, 0.001F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(1.5F, -5.75F, -7.25F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, -0.8727F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 0, 0, 0.0F, 0.0F, -0.5F, 0, 3, 3, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-1.5F, -5.75F, -7.25F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, 0.8727F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 0, 0, 0.0F, 0.0F, -0.5F, 0, 3, 3, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-1.0F, -7.725F, -9.95F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 14, 4, 0.5F, 0.0224F, -12.6965F, 1, 1, 7, 0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.2753F, -2.8524F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 29, -0.5F, -1.0F, -0.125F, 3, 2, 3, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 1.0139F, -5.841F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 33, 17, -0.5F, -1.0F, 0.0F, 2, 1, 3, -0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.425F, 0.4397F, -3.395F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0443F, -0.1744F, -0.0077F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 11, -0.625F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.575F, 0.4397F, -3.395F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0443F, 0.1744F, 0.0077F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 11, -0.375F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -0.3691F, -2.9971F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 35, -0.5F, 0.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 10, 32, -0.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.2503F, -2.8024F);
        this.head.addChild(jaw);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -0.2365F, -3.0386F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 0, -0.5F, -0.025F, 1.05F, 2, 1, 2, -0.002F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -7.25F, -3.5F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 13, 14, -1.5F, -0.85F, 0.0F, 3, 2, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 24, 0, -1.0F, -0.15F, 0.0F, 2, 2, 6, -0.001F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(1.0F, 1.6F, 2.0F);
        this.tail.addChild(backleftfin);
        this.setRotateAngle(backleftfin, -0.0873F, 0.0F, -0.7854F);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 19, 34, 0.0F, 0.0F, -1.0F, 0, 2, 4, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-1.0F, 1.6F, 2.0F);
        this.tail.addChild(backrightfin);
        this.setRotateAngle(backrightfin, -0.0873F, 0.0F, 0.7854F);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 19, 34, 0.0F, 0.0F, -1.0F, 0, 2, 4, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 11, -1.5F, -0.75F, 0.0F, 3, 2, 6, -0.001F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 11, 23, -1.0F, -0.25F, 0.0F, 2, 2, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 35, 0, 0.0F, 1.5F, 3.0F, 0, 1, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 20, -1.0F, -0.5F, 0.0F, 2, 2, 6, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 22, 26, 0.0F, 1.25F, 0.0F, 0, 1, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.25F, 6.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 26, 9, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 26, 17, 0.0F, 0.0F, 0.0F, 0, 2, 6, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 30, 29, 0.0F, -0.5F, 0.0F, 0, 2, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.2F;
        this.main.offsetX = 0.238F;
        this.main.rotateAngleY = (float)Math.toRadians(242);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 3.63F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
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
        //this.main.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.2F, true, 0, -0.3F, f2, 1);

            this.flap(frontleftfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(frontrightfin, (float) (speed * 0.75), 0.15F, true, -3, 0, f2, 1);
            this.swing(frontrightfin, (float) (speed * 0.75), 0.2F, true, -3, 0, f2, 1);
            this.flap(backleftfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(backleftfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.flap(backrightfin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);
            this.swing(backrightfin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);


            this.swing(main, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.35F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
