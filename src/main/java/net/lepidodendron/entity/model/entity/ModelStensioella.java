package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelStensioella extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Stensioella;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer eyeother_r1;
    private final AdvancedModelRenderer eyeother_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer cube_r11;

    public ModelStensioella() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Stensioella = new AdvancedModelRenderer(this);
        this.Stensioella.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.2517F, -1.3342F);
        this.Stensioella.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 26, 28, -2.0F, 0.5017F, -5.9158F, 4, 2, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.5677F, -5.037F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3491F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 35, -1.0F, -0.5F, -2.5F, 2, 1, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.7517F, -4.1658F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 18, -2.5F, -1.75F, -2.5F, 5, 3, 7, 0.0F, false));

        this.eyeother_r1 = new AdvancedModelRenderer(this);
        this.eyeother_r1.setRotationPoint(2.2453F, -0.4983F, -5.1123F);
        this.head.addChild(eyeother_r1);
        this.setRotateAngle(eyeother_r1, -0.1586F, 0.2916F, -1.0621F);
        this.eyeother_r1.cubeList.add(new ModelBox(eyeother_r1, 0, 10, -0.75F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.eyeother_r2 = new AdvancedModelRenderer(this);
        this.eyeother_r2.setRotationPoint(-2.2453F, -0.4983F, -5.1123F);
        this.head.addChild(eyeother_r2);
        this.setRotateAngle(eyeother_r2, -0.1586F, -0.2916F, 1.0621F);
        this.eyeother_r2.cubeList.add(new ModelBox(eyeother_r2, 0, 10, -0.25F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.4983F, -6.9158F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5672F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 37, -2.0F, 0.5272F, -1.0048F, 4, 2, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-4.2497F, -0.2044F, -2.5292F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.5258F, 1.029F, 0.4614F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 22, -0.75F, -0.5F, -0.25F, 1, 1, 2, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(4.2497F, -0.2044F, -2.5292F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.5258F, -1.029F, -0.4614F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 25, -0.25F, -0.5F, -0.25F, 1, 1, 2, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.5F, -0.6197F, -1.1951F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3622F, 0.7519F, 0.2533F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.75F, -0.4441F, -1.2244F, 2, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.5F, -0.6197F, -1.1951F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3622F, -0.7519F, -0.2533F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 22, -1.25F, -0.4441F, -1.2244F, 2, 1, 2, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.2517F, -0.1658F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 11, -2.5F, -2.0F, -1.0F, 5, 4, 7, -0.01F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.5F, 0.3785F, -0.2793F);
        this.body.addChild(frontLeftFin);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frontLeftFin.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 1.5708F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 0, -5.0038F, 0.75F, -0.7934F, 7, 0, 18, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 18, -1.0038F, 0.25F, -0.7934F, 2, 1, 5, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.5F, 0.3785F, -0.2793F);
        this.body.addChild(frontRightFin);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frontRightFin.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -1.5708F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 0, -1.9962F, 0.75F, -0.7934F, 7, 0, 18, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 18, -0.9962F, 0.25F, -0.7934F, 2, 1, 5, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 22, -2.0F, -1.5F, -1.25F, 4, 3, 7, -0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.75F, 5.75F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 28, -1.0F, -0.5F, -1.25F, 2, 2, 7, -0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 9, 27, 0.0F, -3.5F, 0.25F, 0, 3, 5, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 5.75F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 0, -0.5F, -0.5F, -1.5F, 1, 1, 8, -0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 2, 0.0F, -0.5F, 0.0F, 0, 1, 7, -0.01F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.5F, 1.1285F, 5.2207F);
        this.tail.addChild(backLeftFin);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backLeftFin.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1938F, 0.0795F, -1.1331F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 0, 0.25F, -0.6285F, -1.9707F, 0, 3, 4, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.5F, 1.1285F, 5.2207F);
        this.tail.addChild(backRightFin);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backRightFin.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1938F, -0.0795F, 1.1331F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 0, -0.25F, -0.6285F, -1.9707F, 0, 3, 4, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5 * 0.2F);
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(head, 1.5F, 0.0F, 1.55F);
        this.head.offsetY = -0.0F;
        this.head.offsetX = -0.07F;
        this.head.offsetZ = -0.4F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(head, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body, -0.1F, -0.0F, 0.0F);
        this.setRotateAngle(tail, 0.05F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.05F, 0.1F, 0.0F);
        this.setRotateAngle(tail3, 0.1F, -0.2F, 0.0F);
        this.setRotateAngle(tail4, 0.1F, -0.2F, 0.0F);
        this.setRotateAngle(frontLeftFin, 0.2F, 0.0F, -0.3F);
        this.setRotateAngle(frontRightFin, 0.2F, 0.0F, 0.3F);
        this.head.offsetY = -0.1F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(head, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.05F, -0.1F, 0.0F);
        this.setRotateAngle(tail2, -0.05F, -0.1F, 0.0F);
        this.setRotateAngle(tail3, -0.1F, 0.2F, 0.0F);
        this.setRotateAngle(tail4, -0.1F, 0.2F, 0.0F);
        this.setRotateAngle(frontLeftFin, -0.2F, 0.0F, 0.3F);
        this.setRotateAngle(frontRightFin, -0.2F, 0.0F, -0.3F);
        this.head.offsetY = 0.1F;
        this.head.render(0.01F);
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
        this.head.offsetY = 1.45F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        float speed = 0.3F;
        if (!e.isInWater()) { // if not in water
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {



            this.walk(backLeftFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            if(f3>0 || !e.isInWater()) { //if moving, slap fins
                this.flap(frontLeftFin, speed, 0.4F, true, -3, 0, f2, 1);
                this.flap(frontRightFin, speed, -0.4F, true, -3, 0, f2, 1);
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.25F, -3, f2, 1);
            } else { //if not accelerating swing fins instead
                this.swing(frontLeftFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -0, -0.5F, f2, 1);
                this.swing(frontRightFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -3, 0.5F, f2, 1);
                this.flap(frontLeftFin, (float)(speed*0.15), 0.25F, true, -3, 0, f2, 1);
                this.flap(frontRightFin, (float)(speed*0.15), -0.25F, true, -3, 0, f2, 1);
                this.chainWave(fishTail, speed*0.15F, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed*0.15F, 0.3F, -3, f2, 1);
            }


            this.walk(backRightFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(backRightFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);


            if (!e.isInWater()) {
                this.head.offsetY = 1.45F;
                this.bob(head, -speed, 5F, false, f2, 1);
            }
        }
    }
}
