package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelHarpacanthus extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer antler;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer antler2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;

    public ModelHarpacanthus() {
        this.textureWidth = 52;
        this.textureHeight = 51;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 22.0F, -2.75F);
        this.root.cubeList.add(new ModelBox(root, 0, 0, -2.0F, -3.5F, -4.25F, 4, 5, 8, 0.0F, false));
        this.root.cubeList.add(new ModelBox(root, 23, 22, 0.0F, -6.5F, -3.25F, 0, 3, 7, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.9559F, -4.2232F);
        this.root.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 26, 8, -1.5F, -0.7441F, -3.0268F, 3, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 43, -1.5F, 0.4559F, -1.0268F, 3, 2, 1, 0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, 2.4559F, -1.0268F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 8, -0.5F, -2.0F, -2.0F, 3, 2, 2, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.425F, -0.3232F, -2.8749F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.149F, 0.0949F, 0.0142F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 5, -0.725F, -0.6F, -0.375F, 1, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.425F, -0.3232F, -2.8749F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.149F, -0.0949F, -0.0142F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 5, -0.275F, -0.6F, -0.375F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.1841F, -4.824F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2051F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 35, -1.0F, 0.0022F, -2.2888F, 2, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.8841F, -2.949F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3665F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 40, -1.5F, -0.0162F, -1.9901F, 3, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, -2.4941F, -0.0268F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.192F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 0, -0.5F, 0.0F, -3.0F, 3, 2, 3, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.0F, 0.2559F, -0.0268F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.1134F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 41, -1.0F, -1.0F, -3.0F, 1, 2, 3, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.0F, 0.2559F, -0.0268F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.1134F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 41, 0.0F, -1.0F, -3.0F, 1, 2, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.9219F, -4.9948F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3185F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 41, 29, -1.0F, -1.0378F, -1.9789F, 2, 1, 2, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.2559F, -3.0268F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 37, 0, -1.5F, -2.0F, -2.0F, 3, 2, 2, -0.01F, false));

        this.antler = new AdvancedModelRenderer(this);
        this.antler.setRotationPoint(-0.6F, -1.081F, -5.882F);
        this.head.addChild(antler);
        this.setRotateAngle(antler, 0.0F, -0.2618F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.3F, 0.0F, 0.0F);
        this.antler.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 1.1476F, -0.1096F, -0.2382F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.3644F, 0.6237F, -0.4201F, 0, 1, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.3F, 0.0F, 0.0F);
        this.antler.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.9599F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 13, 14, 0.3144F, -0.1263F, -0.2701F, 0, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0144F, -0.4731F, -0.4704F);
        this.antler.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.223F, 0.0298F, 0.082F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.075F, -0.2F, -0.775F, 0, 1, 1, 0.0F, false));

        this.antler2 = new AdvancedModelRenderer(this);
        this.antler2.setRotationPoint(0.6F, -1.081F, -5.882F);
        this.head.addChild(antler2);
        this.setRotateAngle(antler2, 0.0F, 0.2618F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.3F, 0.0F, 0.0F);
        this.antler2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.1476F, 0.1096F, 0.2382F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -0.3644F, 0.6237F, -0.4201F, 0, 1, 3, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.3F, 0.0F, 0.0F);
        this.antler2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.9599F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 13, 14, -0.3144F, -0.1263F, -0.2701F, 0, 1, 2, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.0144F, -0.4731F, -0.4704F);
        this.antler2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 1.223F, -0.0298F, -0.082F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -0.075F, -0.2F, -0.775F, 0, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.1057F, -2.7868F);
        this.head.addChild(jaw);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, 1.3502F, 1.76F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 8, 39, 0.0F, -1.0F, -5.0F, 2, 1, 3, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-1.875F, 1.025F, -3.5F);
        this.root.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, -0.149F, -0.3572F, -0.1158F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 40, 41, -0.375F, -0.525F, 0.0F, 1, 1, 3, 0.0F, false));
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 0, 33, -0.125F, -2.275F, 0.5F, 0, 3, 5, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(1.875F, 1.025F, -3.5F);
        this.root.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, -0.149F, 0.3572F, 0.1158F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 40, 41, -0.625F, -0.525F, 0.0F, 1, 1, 3, 0.0F, true));
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 0, 33, 0.125F, -2.275F, 0.5F, 0, 3, 5, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.008F, 3.6945F);
        this.root.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 14, -1.5F, -0.992F, -0.9445F, 3, 4, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 12, 29, 0.0F, -4.992F, 0.0555F, 0, 4, 5, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 3.508F, 0.0555F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1047F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 31, 22, -1.5F, -1.0F, 0.0F, 3, 1, 5, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -1.492F, 0.0555F);
        this.tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0916F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 28, 15, -1.5F, 0.0F, 0.0F, 3, 1, 5, -0.01F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-1.575F, 2.308F, 1.6055F);
        this.tail.addChild(backrightfin);
        this.setRotateAngle(backrightfin, -0.0894F, -0.2173F, 0.0193F);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 29, 33, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backrightfin.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1746F, -0.0344F, 0.0061F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 40, 13, 0.0F, 0.0F, 0.0F, 0, 1, 4, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(1.575F, 2.308F, 1.6055F);
        this.tail.addChild(backleftfin);
        this.setRotateAngle(backleftfin, -0.0894F, 0.2173F, -0.0193F);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 29, 33, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backleftfin.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1746F, 0.0344F, -0.0061F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 40, 13, 0.0F, 0.0F, 0.0F, 0, 1, 4, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.008F, 5.0555F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 13, 20, -1.0F, -1.0F, -1.0F, 2, 2, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 23, 33, 0.0F, -4.0F, 0.0F, 0, 3, 5, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tail2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1309F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 25, -1.0F, -1.275F, -0.875F, 2, 1, 6, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.tail2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1484F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 26, 0, -1.0F, 0.05F, -0.825F, 2, 1, 6, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.5F, 5.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 34, 29, -0.5F, 0.0F, -1.0F, 1, 1, 4, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 14, 0.0F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 28, 46, 0.0F, -0.5F, 2.0F, 0, 2, 1, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.5F, 3.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 18, 8, 0.0F, -3.0F, 0.0F, 0, 5, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        //this.body.offsetX = -0.09F;
        this.root.offsetY = -0.16F;
        this.root.offsetX = -0.06F;
        this.root.offsetZ = 0.01F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(antler, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(antler2, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(backleftfin, -0.0894F, 0.2173F, -0.0193F);
        this.setRotateAngle(backrightfin, -0.0894F, -0.2173F, 0.0193F);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 1.1476F, -0.1096F, -0.2382F);
        this.setRotateAngle(cube_r12, 0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 1.223F, 0.0298F, 0.082F);
        this.setRotateAngle(cube_r14, 1.1476F, 0.1096F, 0.2382F);
        this.setRotateAngle(cube_r15, 0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 1.223F, -0.0298F, -0.082F);
        this.setRotateAngle(cube_r17, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, -0.0916F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.149F, 0.0949F, 0.0142F);
        this.setRotateAngle(cube_r20, -0.1746F, -0.0344F, 0.0061F);
        this.setRotateAngle(cube_r21, -0.1746F, 0.0344F, -0.0061F);
        this.setRotateAngle(cube_r22, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, -0.1484F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.149F, -0.0949F, -0.0142F);
        this.setRotateAngle(cube_r4, 0.2051F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.3665F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.192F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0F, 0.1134F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0F, -0.1134F, 0.0F);
        this.setRotateAngle(cube_r9, -0.3185F, 0.0F, 0.0F);
        this.setRotateAngle(frontleftfin, -0.149F, 0.3572F, 0.1158F);
        this.setRotateAngle(frontrightfin, -0.149F, -0.3572F, -0.1158F);
        this.setRotateAngle(head, -0.0436F, -0.0436F, 0.0436F);
        this.setRotateAngle(jaw, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(root, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.0873F, 0.0436F);
        this.setRotateAngle(tail2, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.1745F, 0.0F);
        this.root.offsetY = -0.5F;
        this.root.render(0.01F);
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
        this.root.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);

            this.walk(frontleftfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontleftfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(frontrightfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontrightfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(backleftfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(backleftfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.walk(backrightfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(backrightfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);


            this.swing(root, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.root.rotateAngleZ = (float) Math.toRadians(90);
                //this.root.offsetY = 0.58F;
                this.bob(root, -speed, 5F, false, f2, 1);
            }
        }
    }
}
