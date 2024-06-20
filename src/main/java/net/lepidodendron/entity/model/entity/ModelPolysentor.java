package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPolysentor extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer dorsalfin;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail3;

    public ModelPolysentor() {
        this.textureWidth = 35;
        this.textureHeight = 35;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 7, -2.0F, -11.0F, -3.0F, 4, 3, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -8.5F, -1.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.5F, -0.575F, -2.55F, 3, 2, 5, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -9.5F, -3.5F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 20, -1.5F, -1.5F, -2.5F, 3, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 10, 26, -1.5F, -1.125F, -3.05F, 3, 1, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 25, -1.5F, 0.5F, -1.5F, 3, 2, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.0F, -0.5F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 0, -1.5F, 0.15F, -1.325F, 3, 1, 2, -0.03F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.6467F, -2.7684F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 0, -1.5F, 0.0F, 0.0F, 3, 1, 3, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.2071F, -3.4038F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.829F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 22, 9, -1.5F, -0.5F, -1.5F, 3, 1, 3, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.297F, -3.8055F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4363F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 22, -1.0F, -0.175F, -1.0F, 2, 2, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 3.5F, -3.5F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.48F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 17, -1.5F, -3.825F, -1.75F, 3, 2, 3, -0.02F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.7128F, -1.5292F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.9599F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.4F, -1.15F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.5236F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 17, -1.0F, -0.15F, -0.5F, 2, 1, 2, -0.01F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(1.6F, -7.4F, -2.325F);
        this.body.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, -0.6711F, 0.3133F, -0.2951F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 0, 0, -0.7211F, -0.3965F, -0.1983F, 1, 1, 1, 0.0F, false));
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 0, 0, -0.2211F, -0.8965F, 0.0517F, 0, 2, 2, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-1.6F, -7.4F, -2.325F);
        this.body.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, -0.6711F, -0.3133F, 0.2951F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 0, 0, -0.2789F, -0.3965F, -0.1983F, 1, 1, 1, 0.0F, true));
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 0, 0, 0.2211F, -0.8965F, 0.0517F, 0, 2, 2, 0.0F, true));

        this.dorsalfin = new AdvancedModelRenderer(this);
        this.dorsalfin.setRotationPoint(0.0F, -11.0F, -2.15F);
        this.body.addChild(dorsalfin);
        this.dorsalfin.cubeList.add(new ModelBox(dorsalfin, 0, 2, 0.0F, -1.0F, 0.5F, 0, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.dorsalfin.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3927F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 7, -0.5F, -2.225F, 2.0F, 1, 2, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 21, 0, -0.5F, -1.3F, -0.35F, 1, 2, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -9.2669F, 0.5773F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 12, 3, -1.5F, -0.7331F, -0.5773F, 3, 2, 4, 0.01F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 9, 0.0F, 0.7669F, 2.4227F, 0, 1, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 9, 17, 0.0F, -2.7331F, 0.4227F, 0, 2, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.2669F, 3.4227F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 22, -1.5F, -1.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.7331F, 3.4227F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 10, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(1.25F, 1.1062F, 0.7312F);
        this.tail.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.1309F, 0.0F, -0.6981F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.9107F, 1.1915F);
        this.backleftfin.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.8727F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 8, 0.0F, -1.5F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.15F, 0.9107F, 0.1915F);
        this.backleftfin.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.3927F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 11, 2, -0.15F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-1.25F, 1.1062F, 0.7312F);
        this.tail.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.1309F, 0.0F, 0.6981F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.9107F, 1.1915F);
        this.backrightfin.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.8727F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 12, 8, 0.0F, -1.5F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.15F, 0.9107F, 0.1915F);
        this.backrightfin.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.3927F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 2, 0.15F, -1.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2347F, 3.1276F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 14, 0.0F, 0.5322F, 0.2951F, 0, 2, 3, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 14, 12, 0.0F, -1.9678F, 0.2951F, 0, 2, 3, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 6, 15, -1.0F, 0.0322F, -0.7049F, 2, 1, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.9678F, 0.2951F);
        this.tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2618F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 23, 13, -1.0F, 0.0F, 0.0F, 2, 1, 3, -0.011F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.3447F, 2.9201F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 26, 4, -0.5F, -0.4375F, 0.125F, 1, 1, 3, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 9, 0.0F, -1.3125F, 0.375F, 0, 3, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.root.offsetZ = -1.15F;
        this.root.offsetY = -0.2F;
        this.root.offsetX = -0.0F;
        this.root.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(root, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.root.offsetZ = -0.0F;
        this.root.offsetY = 0.015F;
        this.root.offsetX = 0.0F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.8F;
        this.root.offsetX = 0.9F;
        this.root.rotateAngleY = (float)Math.toRadians(200);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 5.0F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, -0.3F, 3.5F, 0.1F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.6F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.9F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.5F, -3, f2, 1);
            this.swing(root, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), (float)Math.toRadians(15), true, 0, -0.2F, f2, 1);
            this.walk(frontleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(frontleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(frontrightfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(frontrightfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(backleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(backleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(backrightfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(backrightfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                //this.root.offsetY = -0.2F;
                this.root.rotateAngleZ = (float) Math.toRadians(90);
            }
        }
    }
}
