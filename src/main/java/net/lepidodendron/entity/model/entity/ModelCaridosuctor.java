package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelCaridosuctor extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer dorsalfin;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer dorsalfin2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer analfin;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;

    public ModelCaridosuctor() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 27.75F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -8.75F, -5.75F, 4, 5, 6, 0.001F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(1.6994F, -6.0474F, -5.3156F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, -0.6826F, 0.8367F, -0.543F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 14, 36, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.25F, 1.75F);
        this.frontleftfin.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 38, 0.0F, -1.0F, -0.775F, 0, 2, 2, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-1.6994F, -6.0474F, -5.3156F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, -0.6826F, -0.8367F, 0.543F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 14, 36, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.25F, 1.75F);
        this.frontrightfin.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 38, 0.0F, -1.0F, -0.775F, 0, 2, 2, 0.0F, true));

        this.dorsalfin = new AdvancedModelRenderer(this);
        this.dorsalfin.setRotationPoint(0.0F, -8.7071F, -2.1893F);
        this.main.addChild(dorsalfin);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 0.4571F, -0.0607F);
        this.dorsalfin.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 35, 0.5F, -3.5F, -0.5F, 0, 3, 2, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 29, 0.0F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(1.9993F, -4.7392F, -0.6255F);
        this.main.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.8771F, 0.573F, -0.4236F);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 0, 39, -1.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 0, 0, -0.5F, 1.0F, -0.7F, 0, 3, 2, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-1.9993F, -4.7392F, -0.6255F);
        this.main.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.8771F, -0.573F, 0.4236F);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 0, 39, 0.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F, true));
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 0, 0, 0.5F, 1.0F, -0.7F, 0, 3, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -4.25F, -0.25F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 12, -1.5F, -4.0F, 0.0F, 4, 3, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.tail.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2094F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 7, -0.5F, -1.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -4.5F, 0.0F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1222F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 0, -0.5F, 0.0F, 0.2F, 3, 1, 4, 0.0F, false));

        this.dorsalfin2 = new AdvancedModelRenderer(this);
        this.dorsalfin2.setRotationPoint(0.5F, -4.0481F, 2.1392F);
        this.tail.addChild(dorsalfin2);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -0.1228F, 0.5407F);
        this.dorsalfin2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.9512F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 21, 0.5F, -3.25F, -0.5F, 0, 3, 2, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 38, 0.0F, -1.25F, -0.5F, 1, 2, 1, 0.0F, false));

        this.analfin = new AdvancedModelRenderer(this);
        this.analfin.setRotationPoint(0.5F, -0.7736F, 3.998F);
        this.tail.addChild(analfin);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.058F, -0.0854F);
        this.analfin.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.6458F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 38, -0.5F, -0.45F, -0.2F, 1, 2, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.242F, -0.0854F);
        this.analfin.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.7767F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 12, 0.5F, 1.025F, -0.45F, 0, 2, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -2.5F, 4.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 17, -1.0F, -1.0F, 0.0F, 3, 2, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 30, -0.5F, -0.75F, 4.0F, 2, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, -1.8621F, 2.9231F);
        this.tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.288F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 21, -0.475F, -1.75F, -0.05F, 0, 2, 6, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, -1.8621F, 2.9231F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3752F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 30, 33, -1.5F, 0.0F, 0.0F, 2, 1, 3, -0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, -1.5F, 0.5F);
        this.tail2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1484F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 19, 33, -1.5F, 0.0F, -0.55F, 2, 1, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 1.3363F, 6.1895F);
        this.tail2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1745F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 25, 19, 0.0F, -1.3F, -2.35F, 0, 2, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.3691F, 3.4971F);
        this.tail2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3927F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 30, -0.5F, -1.0F, 0.0F, 2, 1, 3, -0.001F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.5F, 0.5F);
        this.tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 31, 19, -0.5F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.5F, -0.25F, 7.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 7, 21, 0.5F, -0.5F, -0.025F, 1, 1, 3, -0.001F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 0.1F, 1.925F);
        this.tail3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 37, 0, 0.475F, -0.35F, -0.15F, 0, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, -0.375F, 1.95F);
        this.tail3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 24, 38, 0.5F, -0.3F, -0.2F, 0, 1, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -3.75F, -0.75F);
        this.main.addChild(head);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, -3.0464F, -8.3185F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.7418F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 14, 14, -0.5F, -2.1F, 0.25F, 3, 1, 1, -0.001F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 26, 14, -0.5F, -1.1F, -0.5F, 3, 1, 3, -0.001F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.05F, -3.7003F, -8.9656F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0438F, -0.0872F, 0.0038F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 23, 14, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.05F, -3.7003F, -8.9656F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0438F, 0.0872F, -0.0038F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 23, 14, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -3.0727F, -9.4935F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0436F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 33, 24, -0.5F, -0.925F, -0.725F, 2, 1, 3, 0.002F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -4.3793F, -8.9523F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2618F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 35, -0.5F, 0.0F, -1.8F, 2, 1, 2, 0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0F, -4.6527F, -6.9696F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1614F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 26, 0, -0.5F, -0.075F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, -5.0F, -5.0F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1309F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 28, 4, -1.5F, 0.0F, -2.0F, 4, 3, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0F, 0.0F, -5.0F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.48F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 23, 27, -0.5F, -2.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, -2.9556F, -6.9946F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 33, 10, -0.5F, -0.1105F, -1.7478F, 2, 1, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.0F, 0.1378F, -2.4212F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.48F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 15, 0, -1.25F, -0.45F, -0.2F, 0, 1, 1, 0.0F, true));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 15, 0, 0.25F, -0.45F, -0.2F, 0, 1, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.1378F, -2.4212F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1309F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 36, 14, -0.5F, -0.35F, -0.275F, 2, 1, 1, -0.001F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 1.9937F, 0.1393F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.3927F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 13, 24, -0.5F, -1.0F, -4.0F, 2, 1, 4, 0.001F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.8F, 0.0F, 0.0F);
        this.main.offsetY = -0.21F;
        this.main.offsetX = -0.02F;
        this.main.offsetZ = -0.255F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, -0.2F, 0.0F, -0.1F);
        this.setRotateAngle(tail, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
        this.main.offsetZ = -0.0F;
        this.main.offsetY = -0.12F;
        this.main.offsetX = 0.005F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.8F;
        this.main.offsetX = 0.3F;
        this.main.offsetZ = 1.0F;
        this.main.rotateAngleY = (float)Math.toRadians(200);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 3.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(tail, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.89F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.03F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.335F, -2.6, f2, 1);
            this.swing(main, speed, 0.16F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.35), 0.2F, false, 0f, 0.3f, f2, 1);

            this.flap(backrightfin, speed * 0.8F, 0.75F, false, 0F, -0.3F, f2, 1F);
            this.flap(backleftfin, speed * 0.8F, -0.75F, false, 0F, 0.3F, f2, 1F);
            //this.flap(frontRightFin, speed * 0.8F, -0.25F, false, 0F, -0.1F, f2, 1F);
            //this.flap(frontLeftFin, speed * 0.8F, 0.25F, false, 0F, 0.1F, f2, 1F);
            this.swing(frontrightfin, speed * 0.8F, -0.3F, false, 0F, -0.2F, f2, 1F);
            this.swing(frontleftfin, speed * 0.8F, 0.3F, false, 0F, 0.2F, f2, 1F);

            this.walk(dorsalfin, speed * 0.5F, -0.3F, false, 0.5F, 0F, f2, 1F);
            this.walk(dorsalfin2, speed * 0.5F, -0.3F, false, 0F, 0F, f2, 1F);
            this.walk(analfin, speed * 0.5F, 0.3F, false, 0F, 0.2F, f2, 1F);

            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetX = -0.50F;
                this.main.offsetY = -0.30F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
