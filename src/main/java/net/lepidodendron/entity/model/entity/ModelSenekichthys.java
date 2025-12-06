package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelSenekichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer leftpectoral;
    private final AdvancedModelRenderer rightpectoral;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer leftpelvic;
    private final AdvancedModelRenderer rightpelvic;

    public ModelSenekichthys() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.5F, 24.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.5F, 2.0F, 0.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 15, 9, -2.5F, -4.75F, -3.45F, 3, 2, 4, 0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -5.5F, -1.5F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 12, -1.5F, -1.25F, -1.6F, 3, 3, 4, 0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-1.0F, -4.4616F, 0.2825F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 18, 0, -1.5F, -0.4384F, 0.0175F, 3, 2, 3, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.0384F, 0.7175F);
        this.tail.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.6109F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 0, 0.0F, -4.575F, -0.525F, 0, 4, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.0384F, 0.7175F);
        this.tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 20, -1.5F, -0.7F, -0.65F, 3, 2, 3, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 20, -1.5F, -0.7F, -0.65F, 3, 2, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0464F, 2.8349F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 26, 6, -1.0F, -0.5349F, -0.2923F, 2, 1, 3, 0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 1.5901F, 0.0577F);
        this.tail2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.576F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 28, 0.5F, -0.15F, 0.025F, 0, 5, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 1.5901F, 0.0577F);
        this.tail2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.5236F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 5, -0.5F, -1.15F, 0.025F, 2, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -1.0099F, 0.7577F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 18, -0.5F, -0.05F, -1.0F, 2, 1, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.463F, 2.5029F);
        this.tail2.addChild(tail3);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, 0.4282F, 0.7047F);
        this.tail3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.48F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 0, 1.025F, -0.1F, -0.75F, 0, 1, 7, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, 0.4282F, 0.7047F);
        this.tail3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 1.0F, -0.8F, -0.875F, 0, 2, 9, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 0.5F, -0.8F, -0.875F, 1, 1, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -6.0F, -3.9F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 26, -2.0F, 2.0794F, -3.8855F, 3, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 3.3794F, -0.2855F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2182F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 23, 23, -1.5F, -0.65F, -0.625F, 3, 1, 3, -0.002F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 2.5794F, -2.3855F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.48F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 28, -1.5F, -1.825F, 0.0F, 3, 2, 2, 0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 0.3834F, -1.6489F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.685F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 23, -1.5F, -0.1039F, -2.8366F, 3, 1, 3, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.0F, 1.0F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.4363F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 16, -2.0F, 0.0F, -2.95F, 3, 3, 3, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.525F, 2.025F, -1.4F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.6981F, 0.0F, 0.0F);
        this.eye.cubeList.add(new ModelBox(eye, 10, 20, -0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 10, 20, -2.55F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.leftpectoral = new AdvancedModelRenderer(this);
        this.leftpectoral.setRotationPoint(0.9F, 3.5794F, 0.4895F);
        this.head.addChild(leftpectoral);
        this.setRotateAngle(leftpectoral, 0.3038F, 0.762F, 0.2132F);
        this.leftpectoral.cubeList.add(new ModelBox(leftpectoral, 0, 31, 0.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.rightpectoral = new AdvancedModelRenderer(this);
        this.rightpectoral.setRotationPoint(-1.9F, 3.5794F, 0.4895F);
        this.head.addChild(rightpectoral);
        this.setRotateAngle(rightpectoral, 0.3038F, -0.762F, -0.2132F);
        this.rightpectoral.cubeList.add(new ModelBox(rightpectoral, 0, 31, 0.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 2.825F, -0.7F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 27, 13, -1.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.leftpelvic = new AdvancedModelRenderer(this);
        this.leftpelvic.setRotationPoint(0.55F, -3.2173F, 0.2011F);
        this.body.addChild(leftpelvic);
        this.setRotateAngle(leftpelvic, -1.0549F, 0.4389F, -0.5583F);
        this.leftpelvic.cubeList.add(new ModelBox(leftpelvic, 29, 28, 0.0F, -1.1077F, -0.2011F, 0, 2, 2, 0.0F, false));

        this.rightpelvic = new AdvancedModelRenderer(this);
        this.rightpelvic.setRotationPoint(-2.55F, -3.2173F, 0.2011F);
        this.body.addChild(rightpelvic);
        this.setRotateAngle(rightpelvic, -1.0549F, -0.4389F, 0.5583F);
        this.rightpelvic.cubeList.add(new ModelBox(rightpelvic, 29, 28, 0.0F, -1.1077F, -0.2011F, 0, 2, 2, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
        this.root.offsetZ = -0.39F;
        this.root.offsetY = -0.23F;
        this.root.offsetX = -0.03F;
        this.root.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(root, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.05F, 0.05F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.root.offsetZ = -0.0F;
        this.root.offsetY = -0.05F;
        this.root.offsetX = -0.0F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -1.8F;
        this.root.offsetX = -0.4F;
        this.root.rotateAngleY = (float)Math.toRadians(200);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 5.5F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(head, 0.05F, 0.1F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.4F, 0.0F);
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
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
        //this.head.offsetY = 1.2F;

        AdvancedModelRenderer[] fishTail = {  this.tail2, this.tail3};
        float speed = 0.85F;
        if (!e.isInWater()) {
            speed = 0.89F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.03F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.435F, -2.6, f2, 1);
            this.swing(root, speed, 0.16F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.35), 0.2F, false, 0.5f, 0.16F, f2, 1);

            this.flap(rightpelvic, speed * 0.8F, 0.3F, true, 0F, -0.3F, f2, 1F);
            this.flap(leftpelvic, speed * 0.8F, -0.3F, true, 0F, 0.3F, f2, 1F);
            this.flap(rightpectoral, speed * 0.8F, 0.25F, false, 0F, -0.1F, f2, 1F);
            this.flap(leftpectoral, speed * 0.8F, -0.25F, false, 0F, 0.1F, f2, 1F);
            this.swing(rightpectoral, speed * 0.8F, 0.65F, false, 0F, -0.2F, f2, 1F);
            this.swing(leftpectoral, speed * 0.8F, -0.65F, false, 0F, 0.2F, f2, 1F);

            if (!e.isInWater()) {
                this.root.rotateAngleZ = (float) Math.toRadians(90);
                //this.head.offsetY = 1.20F;
                this.bob(root, -speed, 5F, false, f2, 1);
            }
        }
    }
}
