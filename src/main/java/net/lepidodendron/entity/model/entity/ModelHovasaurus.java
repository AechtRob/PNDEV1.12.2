package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHovasaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelHovasaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended main;
    private final AdvancedModelRendererExtended backleftlegbase;
    private final AdvancedModelRendererExtended backleftleg;
    private final AdvancedModelRendererExtended backleftleg2;
    private final AdvancedModelRendererExtended backrightlegbase;
    private final AdvancedModelRendererExtended backrightleg;
    private final AdvancedModelRendererExtended backrightleg2;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended frontleftleg;
    private final AdvancedModelRendererExtended frontleftleg2;
    private final AdvancedModelRendererExtended frontleftleg3;
    private final AdvancedModelRendererExtended frontrightleg;
    private final AdvancedModelRendererExtended frontrightleg2;
    private final AdvancedModelRendererExtended frontrightleg3;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;

    private ModelAnimator animator;

    public ModelHovasaurus() {
        this.textureWidth = 55;
        this.textureHeight = 50;

        this.main = new AdvancedModelRendererExtended(this);
        this.main.setRotationPoint(0.0F, 25.5F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 30, -1.5F, -6.0F, 2.0F, 3, 4, 4, 0.0F, false));

        this.backleftlegbase = new AdvancedModelRendererExtended(this);
        this.backleftlegbase.setRotationPoint(1.6F, -3.45F, 3.5F);
        this.main.addChild(backleftlegbase);
        this.setRotateAngle(backleftlegbase, -0.402F, 0.1974F, -0.0934F);
        this.backleftlegbase.cubeList.add(new ModelBox(backleftlegbase, 0, 15, -0.75F, -0.9592F, -0.2507F, 1, 2, 3, 0.01F, false));

        this.backleftleg = new AdvancedModelRendererExtended(this);
        this.backleftleg.setRotationPoint(0.25F, 0.0408F, 1.7493F);
        this.backleftlegbase.addChild(backleftleg);
        this.setRotateAngle(backleftleg, 0.3054F, 0.0F, 0.0F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 36, 29, -1.0F, -1.0F, 0.0F, 1, 2, 5, -0.01F, false));

        this.backleftleg2 = new AdvancedModelRendererExtended(this);
        this.backleftleg2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.2897F, 0.1634F, -0.0868F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 30, 34, -0.5F, -2.0F, 0.0F, 0, 4, 5, 0.0F, false));

        this.backrightlegbase = new AdvancedModelRendererExtended(this);
        this.backrightlegbase.setRotationPoint(-1.6F, -3.45F, 3.5F);
        this.main.addChild(backrightlegbase);
        this.setRotateAngle(backrightlegbase, -0.402F, -0.1974F, 0.0934F);
        this.backrightlegbase.cubeList.add(new ModelBox(backrightlegbase, 0, 15, -0.25F, -0.9592F, -0.2507F, 1, 2, 3, 0.01F, true));

        this.backrightleg = new AdvancedModelRendererExtended(this);
        this.backrightleg.setRotationPoint(-0.25F, 0.0408F, 1.7493F);
        this.backrightlegbase.addChild(backrightleg);
        this.setRotateAngle(backrightleg, 0.3054F, 0.0F, 0.0F);
        this.backrightleg.cubeList.add(new ModelBox(backrightleg, 36, 29, 0.0F, -1.0F, 0.0F, 1, 2, 5, -0.01F, true));

        this.backrightleg2 = new AdvancedModelRendererExtended(this);
        this.backrightleg2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.2897F, -0.1634F, 0.0868F);
        this.backrightleg2.cubeList.add(new ModelBox(backrightleg2, 30, 34, 0.5F, -2.0F, 0.0F, 0, 4, 5, 0.0F, true));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, -4.0F, 6.0F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 33, 16, -0.5F, -2.0F, 0.0F, 1, 4, 5, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 30, 0, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.01F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 7, -0.5F, -2.5F, 0.0F, 1, 5, 8, 0.01F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 15, -0.5F, -2.5F, 0.0F, 1, 5, 9, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 21, 21, -0.5F, -2.0F, 0.0F, 1, 4, 8, 0.01F, false));

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, -4.0F, 3.0F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -2.5F, -9.0F, 4, 5, 9, 0.0F, false));

        this.frontleftleg = new AdvancedModelRendererExtended(this);
        this.frontleftleg.setRotationPoint(2.225F, 1.0F, -8.25F);
        this.body.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.1283F, 0.1719F, -0.0306F);
        this.frontleftleg.cubeList.add(new ModelBox(frontleftleg, 8, 41, -0.5F, -1.1302F, -0.2614F, 1, 2, 3, 0.01F, false));

        this.frontleftleg2 = new AdvancedModelRendererExtended(this);
        this.frontleftleg2.setRotationPoint(0.0F, -0.1302F, 2.2386F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, -0.1745F, 0.0F, 0.0F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 12, 17, -0.5F, -1.0F, 0.0F, 1, 2, 4, -0.01F, false));

        this.frontleftleg3 = new AdvancedModelRendererExtended(this);
        this.frontleftleg3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, -0.2618F, 0.0873F, 0.0F);
        this.frontleftleg3.cubeList.add(new ModelBox(frontleftleg3, 0, 0, 0.0F, -1.5F, -0.25F, 0, 3, 4, 0.0F, false));

        this.frontrightleg = new AdvancedModelRendererExtended(this);
        this.frontrightleg.setRotationPoint(-2.225F, 1.0F, -8.25F);
        this.body.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, -0.0899F, -0.1719F, 0.0306F);
        this.frontrightleg.cubeList.add(new ModelBox(frontrightleg, 8, 41, -0.5F, -1.1302F, -0.2614F, 1, 2, 3, 0.01F, true));

        this.frontrightleg2 = new AdvancedModelRendererExtended(this);
        this.frontrightleg2.setRotationPoint(0.0F, -0.1302F, 2.2386F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, -0.1745F, 0.0F, 0.0F);
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 12, 17, -0.5F, -1.0F, 0.0F, 1, 2, 4, -0.01F, true));

        this.frontrightleg3 = new AdvancedModelRendererExtended(this);
        this.frontrightleg3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, -0.2618F, -0.0873F, 0.0F);
        this.frontrightleg3.cubeList.add(new ModelBox(frontrightleg3, 0, 0, 0.0F, -1.5F, -0.25F, 0, 3, 4, 0.0F, true));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, 0.0142F, -9.0165F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 15, 34, -1.5F, -2.2642F, -2.9835F, 3, 3, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 0.7634F, -1.4915F);
        this.neck.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3971F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 8, -1.0F, -1.125F, -1.7F, 2, 2, 4, -0.01F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.1917F, -2.1949F, -2.9238F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 40, 0, -1.1917F, 0.6307F, -2.6597F, 2, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 26, 34, -0.6917F, 0.6307F, -4.6597F, 1, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 18, 6, -0.1167F, 0.5307F, -2.0597F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 18, 6, -1.2667F, 0.5307F, -2.0597F, 1, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(-1.1917F, 1.1307F, -2.6597F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.2618F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 0, 0.0F, -0.5F, -2.025F, 1, 1, 2, -0.01F, true));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.8083F, 1.1307F, -2.6597F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.2618F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 25, 0, -1.0F, -0.5F, -2.025F, 1, 1, 2, -0.01F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.3083F, 0.6307F, -4.6597F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.24F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 39, 8, -1.0F, -0.0911F, -0.0118F, 1, 1, 2, -0.01F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.3083F, 0.0307F, -0.0597F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0175F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 39, -1.5F, -0.0097F, -2.6994F, 2, 1, 3, -0.01F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(-0.1917F, 1.6307F, -0.0597F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.1745F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 41, 12, -1.0F, 0.0F, -2.6F, 2, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 11, 30, -0.5F, 0.0F, -4.6F, 1, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, 1.5F, -0.35F);
        this.jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1571F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 0, -0.5F, -1.0F, -3.25F, 1, 1, 4, -0.01F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(-1.0F, -0.5F, -2.6F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.2618F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 21, 22, 0.0F, 0.5F, -2.025F, 1, 1, 2, -0.01F, true));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(1.0F, -0.5F, -2.6F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.2618F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 21, 22, -1.0F, 0.5F, -2.025F, 1, 1, 2, -0.01F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, 0.4F, 0.2F, 0.3F);
        this.setRotateAngle(body, 0.0F, -0.4F, 0.0F);
        this.setRotateAngle(neck, -0.1F, -0.4F, 0.0F);
        this.setRotateAngle(head, -0.1F, -0.4F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, -0.1F, 0.3F, 0.0F);
        this.setRotateAngle(tail3, -0.0F, -0.4F, 0.0F);
        this.setRotateAngle(tail4, -0.2F, -0.5F, 0.0F);
        this.main.offsetY = -0.15F;
        this.main.offsetX = -0.015F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
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
        //this.main.offsetY = 1.4F; //72

        EntityPrehistoricFloraHovasaurus hova = (EntityPrehistoricFloraHovasaurus) e;

        this.faceTarget(f3, f4, 4, head);

        float speed = 0.225F / 2F;
        if (hova.getIsFast()) {
            speed = speed * 1.52F;
        }
        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Torso = {this.body, this.neck, this.head};
        hova.tailBuffer.applyChainSwingBuffer(Tail);

        if (!hova.isReallyInWater()) {
            //land pose
            this.setRotateAngle(cube_r1, -0.3971F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r2, 0.0F, -0.2618F, 0.0F);
            this.setRotateAngle(cube_r3, 0.0F, 0.2618F, 0.0F);
            this.setRotateAngle(cube_r4, 0.24F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r5, 0.0175F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, -0.1571F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, 0.0F, -0.2618F, 0.0F);
            this.setRotateAngle(cube_r8, 0.0F, 0.2618F, 0.0F);
            this.setRotateAngle(frontleftleg, -0.6533F, 0.227F, -1.1897F);
            this.setRotateAngle(frontleftleg2, -1.6643F, 0.0803F, -0.1551F);
            this.setRotateAngle(frontleftleg3, -0.2547F, 0.267F, -0.003F);
            this.setRotateAngle(frontrightleg, -0.6533F, -0.227F, 1.1897F);
            this.setRotateAngle(frontrightleg2, -1.6643F, -0.0803F, 0.1551F);
            this.setRotateAngle(frontrightleg3, -0.2547F, -0.267F, 0.003F);

            this.setRotateAngle(backleftlegbase, -(float)Math.toRadians(55.744), -(float)Math.toRadians(0.6429), -(float)Math.toRadians(56.5821));
            this.setRotateAngle(backleftleg, (float)Math.toRadians(14.769), (float)Math.toRadians(21.366), -(float)Math.toRadians(20.1972));
            this.setRotateAngle(backleftleg2, (float)Math.toRadians(16.4264), (float)Math.toRadians(4.5679), -(float)Math.toRadians(6.4066));
            this.setRotateAngle(backrightlegbase, -(float)Math.toRadians(55.744), (float)Math.toRadians(0.6429), (float)Math.toRadians(56.5821));
            this.setRotateAngle(backrightleg, (float)Math.toRadians(14.769), -(float)Math.toRadians(21.366), (float)Math.toRadians(20.1972));
            this.setRotateAngle(backrightleg2, (float)Math.toRadians(16.4264), -(float)Math.toRadians(4.5679), (float)Math.toRadians(6.4066));
            this.setRotateAngle(jaw, 0.1745F, 0.0F, 0.0F);
            if (f3 == 0.0F || !hova.getIsMoving()) {
                this.chainSwing(Tail, speed*0.8F, 0.25F, -2.8, f2, 0.5F);
                return;
            }
            AdvancedModelRenderer[] FrontR = {this.frontrightleg, this.frontrightleg2, this.frontrightleg3};
            AdvancedModelRenderer[] FrontL = {this.frontleftleg, this.frontleftleg2, this.frontleftleg3};
            AdvancedModelRenderer[] BackR = {this.backrightlegbase, this.backrightleg, this.backrightleg2};
            AdvancedModelRenderer[] BackL = {this.backleftlegbase, this.backleftleg, this.backleftleg2};
            this.chainWaveExtended(FrontL, speed * 0.5F, -0.25F, -1, 1F, f2, 1);
            this.chainWaveExtended(FrontR, speed * 0.5F, -0.25F, -1, -3F, f2, 1);
            this.chainWaveExtended(BackL, speed * 0.5F, -0.15F, -1, -3F, f2, 1);
            //this.chainSwingExtended(BackL, speed * 0.5F, -0.1F, -1, -3F, f2, 1);
            this.chainWaveExtended(BackR, speed * 0.5F, -0.15F, -1, 1F, f2, 1);
            //this.chainSwingExtended(BackR, speed * 0.5F, -0.1F, -1, 1F, f2, 1);

            this.walk(jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.chainSwing(Tail, speed*0.8F, 0.25F, -2.8, f2, 0.5F);
            this.chainSwing(Torso, speed*0.8F, 0.25F, -2.8, f2, 0.5F);




        } else { //swim
            speed = speed * 4F;
            //swim pose
            //Feet:
            AdvancedModelRenderer[] FrontR = {this.frontrightleg, this.frontrightleg2, this.frontrightleg3};
            AdvancedModelRenderer[] FrontL = {this.frontleftleg, this.frontleftleg2, this.frontleftleg3};
            AdvancedModelRenderer[] BackR = {this.backrightlegbase, this.backrightleg, this.backrightleg2};
            AdvancedModelRenderer[] BackL = {this.backleftlegbase, this.backleftleg, this.backleftleg2};
            this.walk(jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);


            if (f3 == 0.0F || !hova.getIsMoving()) { //Not moving
                this.chainSwingExtended(FrontL, speed * 0.2F, -0.3F, -1, 0F, f2, 1);
                this.chainSwingExtended(FrontR, speed * 0.2F, -0.3F, -1, 3F, f2, 1);
                this.chainSwingExtended(BackL, speed * 0.2F, -0.3F, -1, 0F, f2, 1);
                this.chainSwingExtended(BackR, speed * 0.2F, -0.3F, -1, 3F, f2, 1);
            }


            this.chainWave(Tail, speed, 0.012F, -0.2, f2, 0.5F);
            this.chainSwing(Tail, speed, 0.4F, -2.8, f2, 0.5F);
            this.swing(main, speed, 0.2F, true, 0, 0, f2, 1);
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.neck, 0,0,-1F);
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.neck, 0,0,-1F);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(0), (float) Math.toRadians(-25), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);
    }
}
