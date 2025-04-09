package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHenodus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelHenodus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended henodus;
    private final AdvancedModelRendererExtended shell;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended frontleftleg;
    private final AdvancedModelRendererExtended frontleftleg2;
    private final AdvancedModelRendererExtended frontrightleg3;
    private final AdvancedModelRendererExtended frontrightleg4;
    private final AdvancedModelRendererExtended backleftleg;
    private final AdvancedModelRendererExtended backleftleg2;
    private final AdvancedModelRendererExtended backrightleg3;
    private final AdvancedModelRendererExtended backrightleg4;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;

    private ModelAnimator animator;

    public ModelHenodus() {
        this.textureWidth = 76;
        this.textureHeight = 56;

        this.henodus = new AdvancedModelRendererExtended(this);
        this.henodus.setRotationPoint(-0.5F, 23.0F, 0.0F);


        this.shell = new AdvancedModelRendererExtended(this);
        this.shell.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.henodus.addChild(shell);
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -6.0F, -2.0F, -5.0F, 13, 3, 13, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(-0.5F, -0.5F, 0.5F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.0436F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 33, -12.0F, -1.0F, -5.5F, 2, 1, 11, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 27, 16, -10.0F, -1.0F, -7.5F, 4, 1, 16, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 16, -6.0F, -1.0F, -7.5F, 5, 1, 17, 0.0F, true));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(1.5F, -0.5F, 0.5F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.0436F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 33, 33, 10.0F, -1.0F, -5.5F, 2, 1, 11, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 16, 6.0F, -1.0F, -7.5F, 4, 1, 16, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 16, 1.0F, -1.0F, -7.5F, 5, 1, 17, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(-12.5113F, -0.5197F, 6.25F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.5236F, -0.0436F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.1272F, -0.4564F, -0.1949F, 2, 1, 4, -0.01F, true));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(13.5113F, -0.5197F, 6.25F);
        this.shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.5236F, 0.0436F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -2.1272F, -0.4564F, -0.1949F, 2, 1, 4, -0.01F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-11.5113F, -0.5197F, -6.0F);
        this.shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.7854F, -0.0436F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 10, -1.5F, -0.5F, 0.0F, 3, 1, 2, -0.01F, true));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(12.5113F, -0.5197F, -6.0F);
        this.shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.7854F, 0.0436F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 10, -1.5F, -0.5F, 0.0F, 3, 1, 2, -0.01F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(-6.5142F, -0.6506F, 10.0F);
        this.shell.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.1309F, -0.0436F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 27, 30, -3.9981F, -0.5872F, -1.0F, 4, 1, 1, -0.02F, true));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(7.5142F, -0.6506F, 10.0F);
        this.shell.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.1309F, 0.0436F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 27, 30, -0.0019F, -0.5872F, -1.0F, 4, 1, 1, -0.02F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.5F, -0.6644F, -4.7327F);
        this.shell.addChild(neck);
        this.setRotateAngle(neck, 0.0436F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.1644F, -0.5173F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 34, -1.5F, -1.1F, -3.0F, 4, 2, 5, -0.01F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, -0.611F, -3.0037F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 13, 34, -2.0F, -0.7237F, -1.9919F, 4, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 33, 34, -2.0F, -0.4637F, -5.2419F, 4, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(-0.5F, -0.7237F, 0.0081F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6981F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 3, -1.5F, -0.75F, 0.0F, 1, 1, 0, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 3, 1.5F, -0.75F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, -0.7237F, -1.9919F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 27, 26, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(-1.0F, -0.2237F, -3.7419F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1309F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.01F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 5, 1.5F, -0.5F, -0.5F, 1, 1, 1, -0.01F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(-0.8929F, -0.7237F, -1.0171F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.18F, -0.3007F, -0.5509F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.25F, -0.25F, -1.0F, 0, 1, 2, 0.0F, true));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.8929F, -0.7237F, -1.0171F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.18F, 0.3007F, 0.5509F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -0.25F, -0.25F, -1.0F, 0, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(-0.5F, 0.2763F, -1.9919F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 22, -1.0F, 0.0F, -3.25F, 3, 1, 4, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 35, 18, -1.0F, -0.5F, -0.39F, 3, 1, 1, -0.02F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 35, 16, -1.0F, -0.75F, -1.35F, 3, 1, 1, -0.02F, false));

        this.frontleftleg = new AdvancedModelRendererExtended(this);
        this.frontleftleg.setRotationPoint(3.75F, -0.25F, -4.75F);
        this.shell.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.1309F, -0.3491F, 0.0F);
        this.frontleftleg.cubeList.add(new ModelBox(frontleftleg, 27, 34, -1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.frontleftleg2 = new AdvancedModelRendererExtended(this);
        this.frontleftleg2.setRotationPoint(0.0F, 0.5F, -1.75F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, 0.0F, -0.2618F, 0.0F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 27, 16, -1.0F, -0.75F, -3.5F, 2, 1, 4, 0.01F, false));

        this.frontrightleg3 = new AdvancedModelRendererExtended(this);
        this.frontrightleg3.setRotationPoint(-2.75F, -0.25F, -4.75F);
        this.shell.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, 0.1309F, 0.3491F, 0.0F);
        this.frontrightleg3.cubeList.add(new ModelBox(frontrightleg3, 27, 34, -1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F, true));

        this.frontrightleg4 = new AdvancedModelRendererExtended(this);
        this.frontrightleg4.setRotationPoint(0.0F, 0.5F, -1.75F);
        this.frontrightleg3.addChild(frontrightleg4);
        this.setRotateAngle(frontrightleg4, 0.0F, 0.2618F, 0.0F);
        this.frontrightleg4.cubeList.add(new ModelBox(frontrightleg4, 27, 16, -1.0F, -0.75F, -3.5F, 2, 1, 4, 0.01F, true));

        this.backleftleg = new AdvancedModelRendererExtended(this);
        this.backleftleg.setRotationPoint(2.75F, -0.25F, 7.25F);
        this.shell.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.2182F, 0.3054F, 0.0F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 0, 27, -1.1735F, -1.1358F, -0.3877F, 3, 2, 3, 0.0F, false));

        this.backleftleg2 = new AdvancedModelRendererExtended(this);
        this.backleftleg2.setRotationPoint(0.3265F, -0.1358F, 2.3623F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.0F, 0.2182F, 0.0F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 0, 5, -1.0F, -0.5F, -0.5F, 2, 1, 4, 0.0F, false));

        this.backrightleg3 = new AdvancedModelRendererExtended(this);
        this.backrightleg3.setRotationPoint(-1.75F, -0.25F, 7.25F);
        this.shell.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, -0.2182F, -0.3054F, 0.0F);
        this.backrightleg3.cubeList.add(new ModelBox(backrightleg3, 0, 27, -1.8265F, -1.1358F, -0.3877F, 3, 2, 3, 0.0F, true));

        this.backrightleg4 = new AdvancedModelRendererExtended(this);
        this.backrightleg4.setRotationPoint(-0.3265F, -0.1358F, 2.3623F);
        this.backrightleg3.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, 0.0F, -0.2182F, 0.0F);
        this.backrightleg4.cubeList.add(new ModelBox(backrightleg4, 0, 5, -1.0F, -0.5F, -0.5F, 2, 1, 4, 0.0F, true));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.5F, -1.0F, 8.0F);
        this.shell.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 16, -1.5F, -0.5F, -0.75F, 3, 2, 4, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 9, 25, 1.0F, -1.0F, -0.75F, 0, 1, 4, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 9, 25, -1.0F, -1.0F, -0.75F, 0, 1, 4, 0.0F, true));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 27, 21, -1.0F, 0.0F, -0.75F, 2, 1, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 9, 24, 0.5F, -0.5F, -0.75F, 0, 1, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 9, 24, -0.5F, -0.5F, -0.75F, 0, 1, 4, 0.0F, true));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 21, 34, -0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 9, 23, 0.0F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.henodus.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.henodus.offsetY = -0.9F;
        this.henodus.offsetX = 0.1F;
        this.henodus.offsetZ = 2.0F;
        this.henodus.rotateAngleY = (float)Math.toRadians(120);
        this.henodus.rotateAngleX = (float)Math.toRadians(1);
        this.henodus.rotateAngleZ = (float)Math.toRadians(0);
        this.henodus.scaleChildren = true;
        float scaler = 1.2F;
        this.henodus.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(henodus, 0.2F, 3.8F, -0.0F);
        this.setRotateAngle(shell, 0.2382F, -0.1096F, 0.4232F);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.0436F);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.0436F);
        this.setRotateAngle(cube_r3, 0.0F, 0.5236F, -0.0436F);
        this.setRotateAngle(cube_r4, 0.0F, -0.5236F, 0.0436F);
        this.setRotateAngle(cube_r5, 0.0F, 0.7854F, -0.0436F);
        this.setRotateAngle(cube_r6, 0.0F, -0.7854F, 0.0436F);
        this.setRotateAngle(cube_r7, 0.0F, -0.1309F, -0.0436F);
        this.setRotateAngle(cube_r8, 0.0F, 0.1309F, 0.0436F);
        this.setRotateAngle(neck, 0.3934F, -0.1744F, -0.0077F);
        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.3237F, -0.3323F, -0.109F);
        this.setRotateAngle(cube_r10, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 0.18F, -0.3007F, -0.5509F);
        this.setRotateAngle(cube_r14, 0.18F, 0.3007F, 0.5509F);
        this.setRotateAngle(jaw, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(frontleftleg, 0.1309F, -0.3491F, 0.0F);
        this.setRotateAngle(frontleftleg2, 0.4378F, -0.3751F, -0.7132F);
        this.setRotateAngle(frontrightleg3, 0.1309F, 0.3491F, 0.0F);
        this.setRotateAngle(frontrightleg4, 1.3847F, 0.0779F, 1.2752F);
        this.setRotateAngle(backleftleg, -0.2182F, 0.3054F, 0.0F);
        this.setRotateAngle(backleftleg2, -0.1808F, 0.1396F, 0.8845F);
        this.setRotateAngle(backrightleg3, -0.2182F, -0.3054F, 0.0F);
        this.setRotateAngle(backrightleg4, 0.1897F, -0.1084F, -1.0575F);
        this.setRotateAngle(tail, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.3491F, 0.0F);
        //End of pose, now render the model:
        this.henodus.render(f);
        //Reset rotations, positions and sizing:
        this.henodus.setScale(1.0F, 1.0F, 1.0F);
        this.henodus.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.henodus.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(shell, 0.2382F, -0.1096F, 0.4232F);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.0436F);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.0436F);
        this.setRotateAngle(cube_r3, 0.0F, 0.5236F, -0.0436F);
        this.setRotateAngle(cube_r4, 0.0F, -0.5236F, 0.0436F);
        this.setRotateAngle(cube_r5, 0.0F, 0.7854F, -0.0436F);
        this.setRotateAngle(cube_r6, 0.0F, -0.7854F, 0.0436F);
        this.setRotateAngle(cube_r7, 0.0F, -0.1309F, -0.0436F);
        this.setRotateAngle(cube_r8, 0.0F, 0.1309F, 0.0436F);
        this.setRotateAngle(neck, 0.3934F, -0.1744F, -0.0077F);
        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.3237F, -0.3323F, -0.109F);
        this.setRotateAngle(cube_r10, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 0.18F, -0.3007F, -0.5509F);
        this.setRotateAngle(cube_r14, 0.18F, 0.3007F, 0.5509F);
        this.setRotateAngle(jaw, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(frontleftleg, 0.1309F, -0.3491F, 0.0F);
        this.setRotateAngle(frontleftleg2, 0.4378F, -0.3751F, -0.7132F);
        this.setRotateAngle(frontrightleg3, 0.1309F, 0.3491F, 0.0F);
        this.setRotateAngle(frontrightleg4, 1.3847F, 0.0779F, 1.2752F);
        this.setRotateAngle(backleftleg, -0.2182F, 0.3054F, 0.0F);
        this.setRotateAngle(backleftleg2, -0.1808F, 0.1396F, 0.8845F);
        this.setRotateAngle(backrightleg3, -0.2182F, -0.3054F, 0.0F);
        this.setRotateAngle(backrightleg4, 0.1897F, -0.1084F, -1.0575F);
        this.setRotateAngle(tail, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.3491F, 0.0F);
        this.henodus.offsetY = -0.23F;
        this.henodus.render(0.01F);
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
        //this.henodus.offsetY = 0.82F;

        EntityPrehistoricFloraHenodus Henodus = (EntityPrehistoricFloraHenodus) e;

        //this.faceTarget(f3, f4, 5, neckbase);
        this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 5, head);

        float speed = 0.2F;
        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};

        AdvancedModelRenderer[] FL = {this.frontleftleg, this.frontleftleg2};
        AdvancedModelRenderer[] FR = {this.frontrightleg3, this.frontrightleg4};
        AdvancedModelRenderer[] BL = {this.backleftleg, this.backleftleg2};
        AdvancedModelRenderer[] BR = {this.backrightleg3, this.backrightleg4};

        if (!Henodus.isReallyInWater()) {

            if (f3 == 0.0F || !Henodus.getIsMoving()) {
                return;
            }

            this.swing(this.frontrightleg3, speed * 0.6F, 0.6F,false, -0.8F,0.6F, f2, 1F);
            this.swing(this.frontleftleg, speed * 0.6F, 0.6F,true, 0.8F,0.6F, f2, 1F);

            this.swing(this.backrightleg3, speed * 0.6F, 0.4F,false, 0.8F,0.4F, f2, 1F);
            this.swing(this.backleftleg, speed * 0.6F, 0.4F,true, 0.8F,0.4F, f2, 1F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * 0.8F, 0.12F, -3, f2, 0.8F);

        }
        else {

            if (f3 == 0.0F) {
                this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(Tail, speed * 0.8F, 0.06F, -3, f2, 0.8F);
                return;
            }

            speed = speed * 2F;

            this.chainWaveExtended(FR, speed * 0.8F, -0.12F, 1.5, 0, f2, 0.8F);
            this.chainWaveExtended(FL, speed * 0.8F, -0.12F, 1.5, 3F, f2, 0.8F);
            this.chainWaveExtended(BR, speed * 0.8F, -0.12F, 1.5, 3F, f2, 0.8F);
            this.chainWaveExtended(BL, speed * 0.8F, -0.12F, 1.5, 0, f2, 0.8F);

            this.chainWaveExtended(FR, speed * 0.8F, -0.12F, 1.5, 0, f2, 0.8F);
            this.chainWaveExtended(FL, speed * 0.8F, -0.12F, 1.5, 3F, f2, 0.8F);
            this.chainWaveExtended(BR, speed * 0.8F, -0.12F, 1.5, 3F, f2, 0.8F);
            this.chainWaveExtended(BL, speed * 0.8F, -0.12F, 1.5, 0, f2, 0.8F);

            this.chainSwingExtended(FR, speed * 0.8F, 0.12F, -1.5, 0, f2, 0.8F);
            this.chainSwingExtended(FL, speed * 0.8F, 0.12F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BR, speed * 0.8F, 0.12F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BL, speed * 0.8F, 0.12F, -1.5, 0, f2, 0.8F);

            this.chainSwingExtended(FR, speed * 0.8F, 0.12F, -1.5, 0, f2, 0.8F);
            this.chainSwingExtended(FL, speed * 0.8F, 0.12F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BR, speed * 0.8F, 0.12F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BL, speed * 0.8F, 0.12F, -1.5, 0, f2, 0.8F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed, 0.35F, -3, f2, 1F);

        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.neck, 0,0,-2F);
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.neck, 0,0,-2F);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(0), (float) Math.toRadians(25), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);
    }
}
