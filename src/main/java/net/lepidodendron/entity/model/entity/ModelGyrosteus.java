package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraGyrosteus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGyrosteus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer fronthead;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;

    public ModelGyrosteus() {
        this.textureWidth = 256;
        this.textureHeight = 256;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 36.0F, -2.0F);
        this.main.cubeList.add(new ModelBox(main, 42, 40, -6.5F, -29.0F, -1.0F, 13, 17, 18, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -29.75F, 8.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0218F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 10, -6.0F, -0.525F, -9.025F, 12, 2, 18, 0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -21.6001F, -1.2266F);
        this.main.addChild(head);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 9.6001F, 0.2266F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 94, -5.5F, -6.0F, -10.0F, 11, 6, 10, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -8.3999F, 0.2266F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 86, 28, -5.5F, 0.0F, -13.0F, 11, 2, 13, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 62, -6.0F, 2.0F, -13.0F, 12, 10, 13, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(5.25F, 8.1001F, -0.5234F);
        this.head.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.4068F, -0.1624F, 0.3591F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 72, 81, -0.1621F, -0.6496F, -0.7807F, 3, 2, 4, 0.0F, false));
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 122, 104, 0.8629F, -0.1496F, -0.6057F, 4, 1, 6, 0.0F, false));
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 62, 14, 1.8629F, 0.3504F, -0.6057F, 18, 0, 14, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-5.25F, 8.1001F, -0.5234F);
        this.head.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.4068F, 0.1624F, -0.3591F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 72, 81, -2.8379F, -0.6496F, -0.7807F, 3, 2, 4, 0.0F, true));
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 122, 104, -4.8629F, -0.1496F, -0.6057F, 4, 1, 6, 0.0F, true));
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 62, 14, -19.8629F, 0.3504F, -0.6057F, 18, 0, 14, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 5.9992F, -13.2029F);
        this.head.addChild(jaw);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.9517F, -0.3544F);
        this.jaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.9599F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 58, -3.5F, -2.9556F, -0.007F, 7, 3, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.337F, -1.0859F);
        this.jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.4268F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 58, -3.5F, -1.0F, -0.5F, 7, 2, 1, -0.001F, false));

        this.fronthead = new AdvancedModelRenderer(this);
        this.fronthead.setRotationPoint(0.0F, 21.6001F, 1.2266F);
        this.head.addChild(fronthead);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -24.036F, -20.1825F);
        this.fronthead.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.432F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 104, 58, -5.0F, -0.077F, 0.2112F, 10, 7, 7, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -12.8708F, -10.9687F);
        this.fronthead.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.3832F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 82, 121, -4.0F, -3.9428F, 0.0123F, 8, 4, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -15.9214F, -16.353F);
        this.fronthead.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.4268F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 110, -4.5F, -0.1015F, -0.0342F, 9, 8, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -23.036F, -21.6825F);
        this.fronthead.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.8727F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 112, 12, -3.5F, 0.5543F, -2.0585F, 7, 8, 4, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(4.9F, -20.5F, -16.1F);
        this.fronthead.addChild(eye);
        this.eye.cubeList.add(new ModelBox(eye, 0, 85, -1.7F, -1.5F, -1.5F, 2, 3, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eye.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3054F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 6, 11, -1.55F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 58, -1.575F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-4.9F, -20.5F, -16.1F);
        this.fronthead.addChild(eye2);
        this.eye2.cubeList.add(new ModelBox(eye2, 0, 68, -0.3F, -1.5F, -1.5F, 2, 3, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eye2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3054F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 11, -0.45F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 38, 10, -0.425F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -20.9543F, 16.9067F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, -6.0F, -7.0457F, -0.9067F, 12, 14, 14, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -8.5457F, 6.5933F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.048F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 36, 75, -5.5F, -0.5F, -7.475F, 11, 3, 14, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 8.9543F, 0.0933F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.048F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 72, 78, -5.5F, -2.05F, -0.95F, 11, 2, 14, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(5.25F, 7.3293F, 11.0933F);
        this.tail.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.4068F, -0.1624F, 0.2719F);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 64, 5, -0.75F, -0.375F, -0.5F, 2, 1, 4, 0.0F, false));
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 50, 30, -0.75F, -0.125F, -0.5F, 13, 0, 10, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-5.25F, 7.3293F, 11.0933F);
        this.tail.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.4068F, 0.1624F, -0.2719F);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 64, 5, -1.25F, -0.375F, -0.5F, 2, 1, 4, 0.0F, true));
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 50, 30, -12.25F, -0.125F, -0.5F, 13, 0, 10, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2005F, 13.0928F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 85, -4.5F, -5.2462F, -0.9996F, 9, 11, 12, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -8.7462F, 0.7504F);
        this.tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.5323F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 96, 0.0F, -13.825F, -0.0922F, 0, 11, 12, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 119, -0.5F, -2.825F, -0.0922F, 1, 3, 9, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -7.2462F, 5.5004F);
        this.tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2138F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 84, 94, -4.0F, -0.325F, -6.425F, 8, 4, 12, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 8.0038F, 0.0004F);
        this.tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.096F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 86, 43, -4.0F, -3.0F, -0.85F, 8, 3, 12, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1409F, 10.9202F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 108, 72, -3.0F, -3.887F, -0.9198F, 6, 8, 8, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 6.613F, 0.0802F);
        this.tail3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1658F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 74, 84, 0.0F, 0.0F, 3.25F, 0, 9, 10, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 78, 110, -2.5F, -3.0F, -0.75F, 5, 3, 8, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -6.387F, 0.0802F);
        this.tail3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1789F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 104, 110, -2.5F, -0.05F, -0.85F, 5, 3, 8, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0964F, 6.9062F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 52, 110, -2.0F, -2.4835F, -0.826F, 4, 5, 9, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -5.4835F, 1.174F);
        this.tail4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1353F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 114, 43, -1.5F, 0.475F, -1.0F, 3, 3, 8, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 5.2665F, 0.174F);
        this.tail4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1789F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 112, 0, -1.5F, -3.0F, -0.65F, 3, 3, 9, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.3744F, 7.992F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 0, -1.5F, -3.1091F, -0.818F, 3, 7, 4, -0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.0F, -16.7832F, 22.6365F);
        this.tail5.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.5105F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 0, -1.0F, 0.525F, -26.925F, 0, 28, 30, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 62, -1.5F, 0.325F, -2.925F, 1, 1, 5, -0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.0F, -12.3586F, 17.1892F);
        this.tail5.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.5978F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 121, 24, -1.5F, -0.55F, -4.75F, 1, 2, 9, -0.001F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, -0.1091F, 3.182F);
        this.tail5.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.6109F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 113, 88, -1.5F, -2.6F, 4.8F, 1, 4, 9, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.0F, -0.1091F, 3.182F);
        this.tail5.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.528F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 71, 121, -2.0F, -3.0F, -2.0F, 2, 5, 7, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.offsetZ = this.main.offsetZ - 0.6F;
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.head.rotateAngleY = (float) Math.toRadians(0);
        this.head.offsetY = 0.2F;
        this.head.offsetX = -0.0F;
        this.head.offsetZ = -0.25F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.15F, 0.0F);
        this.setRotateAngle(frontleftfin, 0.2F, -0.2F, 0.5F);
        this.setRotateAngle(frontrightfin, 0.2F, 0.2F, -0.5F);
        this.setRotateAngle(fronthead, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.12F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.12F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.13F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, -0.19F, 0.0F);
        this.main.offsetY = -0.5F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(main, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.15F, 0.0F);
        this.setRotateAngle(frontleftfin, 0.2F, -0.2F, 0.5F);
        this.setRotateAngle(frontrightfin, 0.2F, 0.2F, -0.5F);
        this.setRotateAngle(fronthead, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.12F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.12F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.13F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.15F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, 0.19F, 0.0F);
        this.main.offsetY = 0.2F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.8F;
        this.main.offsetX = 0.45F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.4F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(head, 0.0F, 0.15F, 0.0F);
        this.setRotateAngle(frontleftfin, 0.2F, -0.2F, 0.5F);
        this.setRotateAngle(frontrightfin, 0.2F, 0.2F, -0.5F);
        this.setRotateAngle(fronthead, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.12F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.12F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.13F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.15F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, 0.19F, 0.0F);
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

        AdvancedModelRenderer[] fishTail = {this.tail2, this.tail3, this.tail4, this.tail5};
        ((EntityPrehistoricFloraGyrosteus)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.15F;
        float still = 1f;
        float inwater = 1f;
        if (f3 == 0.0F) {
            still = 0.3F;}
        if (!e.isInWater()) {
            speed = 0.3F;
            inwater = 0.5F;
        }

        //this.Neck.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.Neck.rotateAngleX += f4 / (180F / (float) Math.PI);

        if (f3 != 0.0F) {this.walk(jaw, (float) (speed * 1.5), 0.2F, true, 0, -0.2F, f2, 1);}

        this.chainWave(fishTail, speed * still, 0.02F * still, -3, f2, 0.8F * still);
        this.chainSwing(fishTail, speed * still, 0.5F * still, -3, f2, 0.6F * still);
        if (e.isInWater()) {
            this.swing(main, speed, 0.15F, true, 0, 0, f2, 1);
        }
        else {
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontleftfin, (float) (speed * 0.65), 0.2F * inwater, true, 0.8F, 0.3F, f2, 1 * inwater);
        this.swing(frontleftfin, (float) (speed * 0.65), 0.15F * inwater, true, 0, 0, f2, 1 * inwater);
        this.flap(frontrightfin, (float) (speed * 0.65), -0.2F * inwater, true, 0.8F, -0.3F, f2, 1 * inwater);
        this.swing(frontrightfin, (float) (speed * 0.65), -0.15F * inwater, true, 0, 0, f2, 1 * inwater);

        this.flap(backleftfin, (float) (speed * 0.65), 0.3F * inwater, true, 0.8F, 0.1F, f2, 1 * inwater);
        this.swing(backleftfin, (float) (speed * 0.65), 0.2F * inwater, true, 0, 0, f2, 1 * inwater);
        this.flap(backrightfin, (float) (speed * 0.65), -0.3F * inwater, true, 0.8F, -0.1F, f2, 1 * inwater);
        this.swing(backrightfin, (float) (speed * 0.65), -0.2F * inwater, true, 0, 0, f2, 1 * inwater);

        if (!e.isInWater()) {
            //this.Body.rotateAngleZ = (float) Math.toRadians(90);
            //this.main.offsetY = -0.2F;
            this.bob(main, -speed * 3.8F, 0.25F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);
        }

    }
}