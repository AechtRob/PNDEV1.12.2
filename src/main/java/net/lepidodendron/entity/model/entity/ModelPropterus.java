package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPropterus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer backrightfin;
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
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;

    public ModelPropterus() {
        this.textureWidth = 55;
        this.textureHeight = 55;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 20.95F, -0.125F);
        this.main.cubeList.add(new ModelBox(main, 17, 12, -2.0F, -3.0F, -3.5F, 4, 6, 7, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(2.0F, 2.5F, 2.0F);
        this.main.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, 0.8727F);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 8, 0, 0.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-2.0F, 2.5F, 2.0F);
        this.main.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, -0.8727F);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 8, 0, -2.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, true));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(2.0F, 2.5F, -3.5F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, 0.6545F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 0, 6, 0.0F, 0.0F, 0.0F, 4, 0, 4, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-2.0F, 2.5F, -3.5F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, -0.6545F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 0, 6, -4.0F, 0.0F, 0.0F, 4, 0, 4, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, 7.5F, -0.5F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 0, -1.0F, -8.0F, -8.0F, 3, 1, 5, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 11, 41, 1.25F, -7.75F, -8.0F, 0, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 11, 41, -0.25F, -7.75F, -8.0F, 0, 1, 3, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 32, 11, -1.0F, -7.0F, -6.0F, 3, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 22, 6, -1.0F, -8.985F, -6.975F, 3, 1, 4, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.0F, -8.7F, -4.625F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3927F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 45, 1.775F, -0.575F, -1.2F, 1, 1, 1, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 45, 4.225F, -0.575F, -1.2F, 1, 1, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 48, 1.925F, -1.075F, -1.7F, 1, 2, 2, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 48, 4.075F, -1.075F, -1.7F, 1, 2, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -9.3F, -6.75F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.8116F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 31, 32, -0.5F, -0.016F, -1.7936F, 3, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -11.3704F, 1.1349F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2793F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 5, -1.5F, 0.0091F, -0.0202F, 3, 2, 3, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -10.675F, -2.8F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.975F, -4.9924F, -0.0243F, 0, 7, 12, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 6, -0.5F, 0.0076F, -0.0243F, 3, 2, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -10.0F, -4.5F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3054F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 0, -0.5F, -0.125F, -2.2F, 3, 2, 4, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -5.5F, -4.5F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3054F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 31, 25, -0.5F, -0.5F, -1.25F, 3, 1, 3, -0.01F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 32, -0.5F, -1.475F, -0.25F, 3, 1, 2, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -7.0F, -6.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 18, 39, 1.4F, -0.25F, -2.0F, 0, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 18, 39, -0.4F, -0.25F, -2.0F, 0, 1, 3, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 34, -0.5F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.75F, -1.0F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2836F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 33, -0.5F, -0.525F, -0.625F, 2, 1, 2, -0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0369F, 3.3619F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 11, 25, -1.5F, -2.5369F, -0.8619F, 3, 5, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -3.0369F, 0.1381F);
        this.tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2531F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 0, -1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 2.4631F, 1.1381F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0524F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 15, -1.0F, -0.65F, -2.0F, 2, 1, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1236F, 1.543F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 23, 25, -1.0F, -1.6606F, -0.4049F, 2, 3, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -2.6606F, 0.5951F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3011F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 7, 0.0F, -1.825F, 0.125F, 0, 2, 3, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 30, 0, -1.0F, 0.075F, -0.875F, 2, 1, 4, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.3394F, 3.5951F);
        this.tail2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2051F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 2, 0.0F, 0.2923F, -3.1615F, 0, 3, 4, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 29, -1.0F, -0.6577F, -3.9115F, 2, 1, 4, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1606F, 3.3451F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 9, 33, -0.5F, -1.0F, -0.75F, 1, 2, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 12, 0.0F, -4.0F, 0.0F, 0, 8, 7, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.6F;
        this.main.offsetX = 0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 3.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.F, 0.3F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.4F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.5F, 0.0F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetZ = 0.02F;
        this.main.offsetY = -0.2F;
        this.main.offsetX = -0.0F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.F, 0.3F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.4F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.5F, 0.0F);
        this.main.offsetY = -0.14F;
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
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.75F, 0.15F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);

            this.walk(frontleftfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontleftfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(frontrightfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontrightfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(backleftfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(backleftfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(backrightfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(backrightfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);


            this.swing(main, speed*0.75F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                //this.main.offsetY = -0.15F;
                this.bob(main, speed*0.75F, 5F, false, f2, 1);
            }
        }
    }
}
