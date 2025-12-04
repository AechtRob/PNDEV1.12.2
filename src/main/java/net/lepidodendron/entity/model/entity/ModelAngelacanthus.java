package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelAngelacanthus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer cube_r26;

    public ModelAngelacanthus() {
        this.textureWidth = 48;
        this.textureHeight = 40;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -6.851F, -3.9478F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3622F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 0, -1.0F, -2.0168F, -2.9703F, 2, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.25F, -7.1379F, -3.8712F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.8727F, 0.0F, -0.2618F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 35, 22, 0.0F, -0.9669F, -0.0662F, 0, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.25F, -7.1379F, -3.8712F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.8727F, 0.0F, 0.2618F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 35, 22, 0.0F, -0.9669F, -0.0662F, 0, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -6.6379F, -0.3462F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 29, 16, -1.0F, -1.7579F, -3.5689F, 2, 2, 3, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -13.1925F, -1.7253F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.5367F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 13, 0.0F, -9.8188F, -1.7355F, 0, 11, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -13.7976F, -2.1687F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0524F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 17, -1.0F, -0.15F, -3.025F, 2, 1, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -10.0F, -2.5F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1527F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 3, -1.5F, -3.3F, -3.275F, 3, 6, 5, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -10.2355F, -1.4409F);
        this.main.addChild(tail);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -2.6641F, 2.0258F);
        this.tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.9643F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 19, 0.0F, -9.0219F, 0.3857F, 0, 9, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.9641F, 2.0258F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.48F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 4, 27, -1.0F, -0.0219F, -0.9893F, 2, 2, 4, -0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -0.5645F, 2.9909F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0218F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 9, -1.5F, -1.1F, -3.0F, 2, 3, 5, 0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 2.3348F, 1.1777F);
        this.tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.48F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 11, 0, 0.0F, -0.177F, 0.4529F, 0, 5, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 3.3348F, 1.6777F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.48F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 0, -1.0F, -3.177F, -1.2221F, 2, 3, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.3654F, 4.9145F);
        this.tail.addChild(tail2);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.8F, -0.5F);
        this.tail2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2182F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 7, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.3799F, -0.0985F);
        this.tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2182F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 8, -0.01F, -3.725F, -0.175F, 0, 7, 6, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -10.0F, -2.5F);
        this.main.addChild(head);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.9319F, -6.2197F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 1.4486F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 38, 0, -1.0F, -0.0254F, -0.996F, 2, 1, 1, -0.02F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.1569F, -6.3197F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 1.4486F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 17, 3, -1.0F, -0.0254F, -0.996F, 2, 1, 1, 0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -2.5333F, -5.1256F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.9905F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 29, 24, -1.0F, -0.0288F, -1.9893F, 2, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.8F, -4.35F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3098F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 19, 30, -1.0F, 0.15F, -1.05F, 2, 1, 2, -0.02F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.025F, -4.05F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1353F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 20, 23, -1.0F, -1.85F, -2.05F, 2, 3, 4, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -1.4379F, -4.3012F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.3098F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 2, -1.075F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 2, 0.075F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -4.125F, -2.625F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.5541F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 28, 11, -1.0F, 0.0F, -3.0F, 2, 2, 3, 0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.9916F, -5.3797F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.3054F, 0.0F, 0.0F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.5406F, -0.5634F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1963F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 31, 29, -0.5F, -1.0F, -0.55F, 1, 1, 1, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-0.325F, -7.718F, -1.904F);
        this.main.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.1309F, 0.0F, -1.2217F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.4F, 0.0F, 0.0F);
        this.backrightfin.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2284F, 0.298F, -0.0681F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 20, 8, -3.5F, 0.0F, -0.7F, 5, 0, 3, 0.0F, true));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(0.325F, -7.718F, -1.904F);
        this.main.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.1309F, 0.0F, 1.2217F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.4F, 0.0F, 0.0F);
        this.backleftfin.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.2284F, -0.298F, 0.0681F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 20, 8, -1.5F, 0.0F, -0.7F, 5, 0, 3, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(0.75F, -9.451F, -4.6978F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, 1.0908F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.5F, 2.0F, 1.3F);
        this.frontleftfin.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.2182F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, 0.5F, -2.0F, -3.0F, 11, 0, 3, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-0.75F, -9.451F, -4.6978F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, -1.0908F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.5F, 2.0F, 1.3F);
        this.frontrightfin.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.2182F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 0, -11.5F, -2.0F, -3.0F, 11, 0, 3, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.4F;
        this.main.offsetX = -0.2F;
        this.main.offsetZ = 4.0F;
        this.main.rotateAngleY = (float)Math.toRadians(220);
        this.main.rotateAngleX = (float)Math.toRadians(40);
        this.main.rotateAngleZ = (float)Math.toRadians(-10);
        this.main.scaleChildren = true;
        float scaler = 1.8F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.5F, 4.76F, -0.2F);
        this.tail2.rotateAngleY = (float) Math.toRadians(-32.5);
        this.tail.rotateAngleY = (float) Math.toRadians(12.5);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.21F;
        this.main.offsetX = -0.03F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.tail2.rotateAngleY = (float) Math.toRadians(-32.5);
        this.tail.rotateAngleY = (float) Math.toRadians(12.5);
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.4F;
        this.main.offsetZ = 0.03F;
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
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;

        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.3F, -3, f2, 1);
            this.swing(main, speed, 0.15F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(frontleftfin, (float) (speed * 0.75), 0.18F, true, 0, 0, f2, 1);
            this.swing(frontleftfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.flap(frontrightfin, (float) (speed * 0.75), 0.18F, true, -3, 0, f2, 1);
            this.swing(frontrightfin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);
            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.2F;
                this.bob(main, speed, 0.1F, false, f2, 1);

            }
        }
    }
}
