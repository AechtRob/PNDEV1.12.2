package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHenodus extends AdvancedModelBase {
    private final AdvancedModelRenderer henodus;
    private final AdvancedModelRenderer shell;
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
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer frontleftleg;
    private final AdvancedModelRenderer frontleftleg2;
    private final AdvancedModelRenderer frontrightleg;
    private final AdvancedModelRenderer frontrightleg2;
    private final AdvancedModelRenderer backleftleg;
    private final AdvancedModelRenderer backleftleg2;
    private final AdvancedModelRenderer backrightleg3;
    private final AdvancedModelRenderer backrightleg4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;

    public ModelSkeletonHenodus() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.henodus = new AdvancedModelRenderer(this);
        this.henodus.setRotationPoint(-0.5F, 23.0F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.henodus.addChild(shell);
        this.setRotateAngle(shell, -0.3054F, 0.0F, -0.1745F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 36, -5.0F, 0.0F, -5.0F, 11, 1, 13, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 53, 0, 6.0F, -1.0F, -5.0F, 1, 2, 13, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 53, 0, -6.0F, -1.0F, -5.0F, 1, 2, 13, 0.0F, true));
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -6.0F, -2.0F, -5.0F, 13, 1, 13, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 41, 54, 0.0F, -1.5F, -5.0F, 1, 1, 13, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 40, 6, -0.5F, -0.3F, -3.9F, 2, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-11.5113F, -0.5197F, -6.0F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.7854F, -0.0436F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 47, 0, -1.5F, -0.5F, 0.0F, 3, 1, 2, -0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -0.5F, 0.5F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.0436F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 56, 16, -12.0F, -1.0F, -5.5F, 2, 1, 11, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 33, 36, -10.0F, -1.0F, -7.5F, 4, 1, 16, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 17, -6.0F, -1.0F, -7.5F, 5, 1, 17, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-12.5113F, -0.5197F, 6.25F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.5236F, -0.0436F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 6, 0.1272F, -0.4564F, -0.1949F, 2, 1, 4, -0.01F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-6.5142F, -0.6506F, 10.0F);
        this.shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.1309F, -0.0436F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 41, 54, -3.9981F, -0.5872F, -1.0F, 4, 1, 1, -0.02F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.5F, -0.5F, 0.5F);
        this.shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.0436F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 56, 16, 10.0F, -1.0F, -5.5F, 2, 1, 11, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 33, 36, 6.0F, -1.0F, -7.5F, 4, 1, 16, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 17, 1.0F, -1.0F, -7.5F, 5, 1, 17, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(13.5113F, -0.5197F, 6.25F);
        this.shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.5236F, 0.0436F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 6, -2.1272F, -0.4564F, -0.1949F, 2, 1, 4, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(12.5113F, -0.5197F, -6.0F);
        this.shell.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.7854F, 0.0436F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 47, 0, -1.5F, -0.5F, 0.0F, 3, 1, 2, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(7.5142F, -0.6506F, 10.0F);
        this.shell.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.1309F, 0.0436F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 41, 54, -0.0019F, -0.5872F, -1.0F, 4, 1, 1, -0.02F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.3F, -4.5F);
        this.shell.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.2182F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 21, -3.0F, -0.6F, -0.4F, 3, 1, 3, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.5F, 0.3F, -4.5F);
        this.shell.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.2182F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 21, 0.0F, -0.6F, -0.4F, 3, 1, 3, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.5F, -0.6644F, -4.7327F);
        this.shell.addChild(neck);
        this.setRotateAngle(neck, 0.0024F, -0.1379F, 0.3024F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -0.4957F, -1.4347F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.4786F, 0.123F, 1.219F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.0F, 0.0347F, -0.0043F, 0, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, -0.4957F, -1.4347F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.4786F, -0.123F, -1.219F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 0.0F, 0.0347F, -0.0043F, 0, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.1644F, -0.5173F);
        this.neck.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1309F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 40, 0, 0.0F, -1.1F, -3.0F, 1, 1, 4, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.611F, -3.0037F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.294F, -0.289F, -0.1801F);
        this.head.cubeList.add(new ModelBox(head, 0, 40, -2.0F, -0.7237F, -1.9919F, 4, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 56, 21, -2.0F, -0.4637F, -5.2419F, 4, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -0.7237F, 0.0081F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.6981F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 6, -1.5F, -0.75F, 0.0F, 1, 1, 0, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 8, 1.5F, -0.75F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.7237F, -1.9919F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 26, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, -0.2237F, -3.7419F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 10, 21, -0.2F, -0.4F, -0.5F, 1, 1, 1, -0.01F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 10, 21, 1.2F, -0.4F, -0.5F, 1, 1, 1, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.8929F, -0.7237F, -1.0171F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.18F, -0.3007F, -0.5509F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 11, 15, 0.25F, -0.25F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.8929F, -0.7237F, -1.0171F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.18F, 0.3007F, 0.5509F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 11, 24, -0.25F, -0.25F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.2763F, -1.9919F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.5672F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 28, 15, -2.0F, -1.1F, 0.0F, 4, 1, 2, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 0.2763F, 0.0081F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.7854F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 28, 19, 1.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 16, 1.0F, 0.0F, -4.25F, 1, 1, 3, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 1, 16, -1.0F, 0.0F, -4.25F, 1, 1, 3, -0.01F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 28, 19, -1.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 88, -1.0F, 0.0F, -5.25F, 3, 1, 1, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, -0.6284F, -2.4027F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.3229F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 51, 4, -2.0F, -0.0382F, 0.6435F, 1, 1, 1, -0.02F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 51, 4, 1.0F, -0.0382F, 0.6435F, 1, 1, 1, -0.02F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, -0.4265F, -1.7567F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0436F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 5, 51, -1.5F, -0.0226F, -1.9706F, 1, 1, 2, -0.02F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 56, 10, -1.5F, -0.0226F, -2.4706F, 1, 1, 1, -0.023F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 56, 10, 0.5F, -0.0226F, -2.4706F, 1, 1, 1, -0.023F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 5, 51, 0.5F, -0.0226F, -1.9706F, 1, 1, 2, -0.02F, false));

        this.frontleftleg = new AdvancedModelRenderer(this);
        this.frontleftleg.setRotationPoint(3.75F, -0.25F, -4.75F);
        this.shell.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.201F, -0.9092F, -0.1144F);
        this.frontleftleg.cubeList.add(new ModelBox(frontleftleg, 56, 16, -1.0F, -0.2F, -2.0F, 1, 1, 3, 0.0F, false));

        this.frontleftleg2 = new AdvancedModelRenderer(this);
        this.frontleftleg2.setRotationPoint(0.0F, 0.5F, -1.75F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, 0.0F, -0.5672F, 0.0F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 41, 57, -1.0F, -0.75F, -1.5F, 1, 1, 2, 0.01F, false));
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 25, 57, -1.5F, -0.75F, -3.5F, 2, 1, 2, 0.01F, false));

        this.frontrightleg = new AdvancedModelRenderer(this);
        this.frontrightleg.setRotationPoint(-2.75F, -0.25F, -4.75F);
        this.shell.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.126F, 0.2192F, -0.0175F);
        this.frontrightleg.cubeList.add(new ModelBox(frontrightleg, 56, 16, 0.0F, -0.2F, -2.0F, 1, 1, 3, 0.0F, true));

        this.frontrightleg2 = new AdvancedModelRenderer(this);
        this.frontrightleg2.setRotationPoint(0.0F, 0.5F, -1.75F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, 0.0F, 0.2618F, 0.0F);
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 41, 57, 0.0F, -0.75F, -1.5F, 1, 1, 2, 0.01F, true));
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 25, 57, -0.5F, -0.75F, -3.5F, 2, 1, 2, 0.01F, true));

        this.backleftleg = new AdvancedModelRenderer(this);
        this.backleftleg.setRotationPoint(2.75F, -0.25F, 7.25F);
        this.shell.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.2086F, -0.0786F, 0.0832F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 6, 55, -0.1735F, -0.6358F, -0.3877F, 1, 1, 3, 0.0F, false));

        this.backleftleg2 = new AdvancedModelRenderer(this);
        this.backleftleg2.setRotationPoint(0.3265F, -0.1358F, 2.3623F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.0F, -0.2618F, 0.0F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 41, 42, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 56, 29, -1.0F, -0.5F, 2.0F, 2, 1, 2, 0.0F, false));

        this.backrightleg3 = new AdvancedModelRenderer(this);
        this.backrightleg3.setRotationPoint(-1.75F, -0.25F, 7.25F);
        this.shell.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, -0.2294F, -0.4331F, 0.0311F);
        this.backrightleg3.cubeList.add(new ModelBox(backrightleg3, 6, 55, -0.8265F, -0.6358F, -0.3877F, 1, 1, 3, 0.0F, true));

        this.backrightleg4 = new AdvancedModelRenderer(this);
        this.backrightleg4.setRotationPoint(-0.3265F, -0.1358F, 2.3623F);
        this.backrightleg3.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, 0.0F, 0.3927F, 0.0F);
        this.backrightleg4.cubeList.add(new ModelBox(backrightleg4, 41, 42, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));
        this.backrightleg4.cubeList.add(new ModelBox(backrightleg4, 56, 29, -1.0F, -0.5F, 2.0F, 2, 1, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.5F, -1.0F, 8.0F);
        this.shell.addChild(tail);
        this.setRotateAngle(tail, 0.0423F, -0.1739F, 0.0154F);
        this.tail.cubeList.add(new ModelBox(tail, 36, 36, -0.5F, -0.5F, -0.75F, 1, 1, 4, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 25, 51, 1.0F, -1.0F, -0.75F, 0, 1, 4, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 25, 51, -1.0F, -1.0F, -0.75F, 0, 1, 4, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.5F, 3.25F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.2214F, -0.1704F, -0.0381F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 34, -0.5F, 0.0F, -0.75F, 1, 1, 4, -0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 51, 0.5F, -0.5F, -0.75F, 0, 1, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 51, -0.5F, -0.5F, -0.75F, 0, 1, 4, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, -0.3491F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 28, 23, -0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 47, 7, 0.0F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.henodus.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
