package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraStegosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelStegosaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended main;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended Plate5;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended babyplates_r1;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended backrightleg;
    private final AdvancedModelRendererExtended backrightleg2;
    private final AdvancedModelRendererExtended backrightleg3;
    private final AdvancedModelRendererExtended backrightleg4;
    private final AdvancedModelRendererExtended backleftleg;
    private final AdvancedModelRendererExtended backleftleg2;
    private final AdvancedModelRendererExtended backleftleg3;
    private final AdvancedModelRendererExtended backleftleg4;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended Plate4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended babyplates_r2;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended Plate8;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended babyplates_r3;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended plate10;
    private final AdvancedModelRendererExtended babyplates_r4;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended plate11;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended babyplates_r5;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended plate12;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended cube_r19;
    private final AdvancedModelRendererExtended plate13;
    private final AdvancedModelRendererExtended cube_r20;
    private final AdvancedModelRendererExtended cube_r21;
    private final AdvancedModelRendererExtended cube_r22;
    private final AdvancedModelRendererExtended tail6;
    private final AdvancedModelRendererExtended thagomizer;
    private final AdvancedModelRendererExtended thagomizer3;
    private final AdvancedModelRendererExtended thagomizer2;
    private final AdvancedModelRendererExtended thagomizer4;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended plate6;
    private final AdvancedModelRendererExtended cube_r23;
    private final AdvancedModelRendererExtended cube_r24;
    private final AdvancedModelRendererExtended cube_r25;
    private final AdvancedModelRendererExtended Plate3;
    private final AdvancedModelRendererExtended cube_r26;
    private final AdvancedModelRendererExtended cube_r27;
    private final AdvancedModelRendererExtended babyplates_r6;
    private final AdvancedModelRendererExtended cube_r28;
    private final AdvancedModelRendererExtended upperbody;
    private final AdvancedModelRendererExtended cube_r29;
    private final AdvancedModelRendererExtended plate7;
    private final AdvancedModelRendererExtended cube_r30;
    private final AdvancedModelRendererExtended cube_r31;
    private final AdvancedModelRendererExtended babyplates_r7;
    private final AdvancedModelRendererExtended cube_r32;
    private final AdvancedModelRendererExtended plate2;
    private final AdvancedModelRendererExtended cube_r33;
    private final AdvancedModelRendererExtended cube_r34;
    private final AdvancedModelRendererExtended babyplates_r8;
    private final AdvancedModelRendererExtended cube_r35;
    private final AdvancedModelRendererExtended plate;
    private final AdvancedModelRendererExtended babyplates_r9;
    private final AdvancedModelRendererExtended cube_r36;
    private final AdvancedModelRendererExtended cube_r37;
    private final AdvancedModelRendererExtended cube_r38;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended cube_r39;
    private final AdvancedModelRendererExtended plate9;
    private final AdvancedModelRendererExtended babyplates_r10;
    private final AdvancedModelRendererExtended cube_r40;
    private final AdvancedModelRendererExtended cube_r41;
    private final AdvancedModelRendererExtended cube_r42;
    private final AdvancedModelRendererExtended plate14;
    private final AdvancedModelRendererExtended cube_r43;
    private final AdvancedModelRendererExtended plate15;
    private final AdvancedModelRendererExtended cube_r44;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended plate17;
    private final AdvancedModelRendererExtended cube_r45;
    private final AdvancedModelRendererExtended plate16;
    private final AdvancedModelRendererExtended cube_r46;
    private final AdvancedModelRendererExtended neck3;
    private final AdvancedModelRendererExtended plate18;
    private final AdvancedModelRendererExtended cube_r47;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r48;
    private final AdvancedModelRendererExtended cube_r49;
    private final AdvancedModelRendererExtended cube_r50;
    private final AdvancedModelRendererExtended cube_r51;
    private final AdvancedModelRendererExtended cube_r52;
    private final AdvancedModelRendererExtended cube_r53;
    private final AdvancedModelRendererExtended cube_r54;
    private final AdvancedModelRendererExtended cube_r55;
    private final AdvancedModelRendererExtended cube_r56;
    private final AdvancedModelRendererExtended eye;
    private final AdvancedModelRendererExtended cube_r57;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r58;
    private final AdvancedModelRendererExtended cube_r59;
    private final AdvancedModelRendererExtended cube_r60;
    private final AdvancedModelRendererExtended cube_r61;
    private final AdvancedModelRendererExtended cube_r62;
    private final AdvancedModelRendererExtended cube_r63;
    private final AdvancedModelRendererExtended cube_r64;
    private final AdvancedModelRendererExtended frontrightleg;
    private final AdvancedModelRendererExtended frontrightleg2;
    private final AdvancedModelRendererExtended frontrightleg3;
    private final AdvancedModelRendererExtended frontrightleg4;
    private final AdvancedModelRendererExtended frontleftleg;
    private final AdvancedModelRendererExtended frontleftleg2;
    private final AdvancedModelRendererExtended frontleftleg3;
    private final AdvancedModelRendererExtended frontleftleg4;

    private ModelAnimator animator;

    public ModelStegosaurus() {
        this.textureWidth = 150;
        this.textureHeight = 190;

        this.main = new AdvancedModelRendererExtended(this);
        this.main.setRotationPoint(0.0F, 23.0F, 2.0F);


        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(body);
        this.setRotateAngle(body, -0.0436F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -25.5603F, 8.1922F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 61, -7.0F, -9.5F, -5.0F, 14, 19, 10, 0.0F, false));

        this.Plate5 = new AdvancedModelRendererExtended(this);
        this.Plate5.setRotationPoint(2.1F, -35.2608F, 7.4189F);
        this.body.addChild(Plate5);
        this.setRotateAngle(Plate5, 0.1523F, -0.0137F, 0.2127F);


        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Plate5.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0524F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 7, 0, -0.5F, -9.0237F, -3.8125F, 1, 3, 2, -0.002F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 101, 53, -0.5F, -11.0237F, -2.8125F, 1, 11, 3, -0.001F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 0.9302F, 0.6958F);
        this.Plate5.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.6109F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 84, 71, -0.5F, -7.2251F, -0.1395F, 1, 2, 14, 0.0F, false));

        this.babyplates_r1 = new AdvancedModelRendererExtended(this);
        this.babyplates_r1.setRotationPoint(0.0F, 0.9302F, 0.6958F);
        this.Plate5.addChild(babyplates_r1);
        this.setRotateAngle(babyplates_r1, -0.1833F, 0.0F, 0.0F);
        this.babyplates_r1.cubeList.add(new ModelBox(babyplates_r1, 38, 139, -0.5F, -6.9804F, -3.2081F, 1, 9, 9, 0.002F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, 0.9302F, 0.6958F);
        this.Plate5.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.384F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 105, 79, -0.5F, -6.9804F, -1.7081F, 1, 9, 9, 0.002F, false));

        this.backrightleg = new AdvancedModelRendererExtended(this);
        this.backrightleg.setRotationPoint(-7.0F, -27.75F, 6.55F);
        this.body.addChild(backrightleg);
        this.setRotateAngle(backrightleg, -0.1309F, 0.0F, 0.0F);
        this.backrightleg.cubeList.add(new ModelBox(backrightleg, 64, 0, -3.5F, -1.5941F, -4.5642F, 8, 18, 9, 0.0F, false));

        this.backrightleg2 = new AdvancedModelRendererExtended(this);
        this.backrightleg2.setRotationPoint(2.0F, 15.6059F, -1.5642F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.3054F, 0.0F, 0.0F);
        this.backrightleg2.cubeList.add(new ModelBox(backrightleg2, 112, 53, -4.5F, -1.1527F, -1.5304F, 6, 8, 6, 0.0F, false));

        this.backrightleg3 = new AdvancedModelRendererExtended(this);
        this.backrightleg3.setRotationPoint(0.0F, 6.5973F, 2.7196F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, -0.0873F, 0.0F, 0.0F);
        this.backrightleg3.cubeList.add(new ModelBox(backrightleg3, 116, 73, -4.0F, 0.0F, -4.25F, 5, 6, 6, 0.0F, false));

        this.backrightleg4 = new AdvancedModelRendererExtended(this);
        this.backrightleg4.setRotationPoint(0.0F, 5.0F, -0.25F);
        this.backrightleg3.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, -0.0436F, 0.0F, 0.0F);
        this.backrightleg4.cubeList.add(new ModelBox(backrightleg4, 102, 30, -5.0F, -1.0F, -5.25F, 7, 3, 7, 0.0F, false));

        this.backleftleg = new AdvancedModelRendererExtended(this);
        this.backleftleg.setRotationPoint(7.0F, -27.75F, 6.55F);
        this.body.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.1309F, 0.0F, 0.0F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 64, 0, -4.5F, -1.5941F, -4.5642F, 8, 18, 9, 0.0F, true));

        this.backleftleg2 = new AdvancedModelRendererExtended(this);
        this.backleftleg2.setRotationPoint(-2.0F, 15.6059F, -1.5642F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.3054F, 0.0F, 0.0F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 112, 53, -1.5F, -1.1527F, -1.5304F, 6, 8, 6, 0.0F, true));

        this.backleftleg3 = new AdvancedModelRendererExtended(this);
        this.backleftleg3.setRotationPoint(0.0F, 6.5973F, 2.7196F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, -0.0873F, 0.0F, 0.0F);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 116, 73, -1.0F, 0.0F, -4.25F, 5, 6, 6, 0.0F, true));

        this.backleftleg4 = new AdvancedModelRendererExtended(this);
        this.backleftleg4.setRotationPoint(0.0F, 5.0F, -0.25F);
        this.backleftleg3.addChild(backleftleg4);
        this.setRotateAngle(backleftleg4, -0.0436F, 0.0F, 0.0F);
        this.backleftleg4.cubeList.add(new ModelBox(backleftleg4, 102, 30, -2.0F, -1.0F, -5.25F, 7, 3, 7, 0.0F, true));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(-0.5F, -34.75F, 11.75F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 48, 71, -4.0F, 0.0F, -0.25F, 9, 13, 8, 0.0F, false));

        this.Plate4 = new AdvancedModelRendererExtended(this);
        this.Plate4.setRotationPoint(-0.6F, 0.1892F, 4.7689F);
        this.tail.addChild(Plate4);
        this.setRotateAngle(Plate4, -0.0602F, -0.0106F, -0.1742F);


        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, -1.7563F, 7.9989F);
        this.Plate4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1571F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 59, 124, -0.5F, -11.9387F, -4.9264F, 1, 10, 3, -0.002F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 53, 124, -0.5F, -13.9387F, -1.9264F, 1, 14, 2, -0.001F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, -6.8397F, -5.725F);
        this.Plate4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5934F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 66, 94, -0.5F, 0.9039F, 8.8038F, 1, 2, 3, -0.001F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 46, 27, -0.5F, -0.0961F, -0.1962F, 1, 2, 18, 0.0F, false));

        this.babyplates_r2 = new AdvancedModelRendererExtended(this);
        this.babyplates_r2.setRotationPoint(0.0F, -0.4261F, -0.4054F);
        this.Plate4.addChild(babyplates_r2);
        this.setRotateAngle(babyplates_r2, -0.096F, 0.0F, 0.0F);
        this.babyplates_r2.cubeList.add(new ModelBox(babyplates_r2, 22, 127, -0.5F, -6.2304F, -3.7081F, 1, 10, 11, 0.002F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, -0.4261F, -0.4054F);
        this.Plate4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.384F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 90, -0.5F, -7.9804F, -2.7081F, 1, 10, 11, 0.002F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.5F, 8.75F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 24, 90, -2.5F, 0.0F, -2.0F, 6, 9, 8, 0.0F, false));

        this.Plate8 = new AdvancedModelRendererExtended(this);
        this.Plate8.setRotationPoint(0.6F, 1.6892F, 5.0189F);
        this.tail2.addChild(Plate8);
        this.setRotateAngle(Plate8, 0.0707F, 0.0106F, 0.1742F);


        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, -3.0735F, 6.2158F);
        this.Plate8.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0524F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 58, -0.5F, -9.9166F, -2.9592F, 1, 10, 3, -0.001F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, -6.8397F, -5.725F);
        this.Plate8.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.5934F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 89, 43, -0.5F, 1.9039F, 8.8038F, 1, 1, 2, -0.002F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 68, 78, -0.5F, -0.0961F, -0.1962F, 1, 2, 14, 0.0F, false));

        this.babyplates_r3 = new AdvancedModelRendererExtended(this);
        this.babyplates_r3.setRotationPoint(0.0F, -0.4261F, -0.4054F);
        this.Plate8.addChild(babyplates_r3);
        this.setRotateAngle(babyplates_r3, -0.096F, 0.0F, 0.0F);
        this.babyplates_r3.cubeList.add(new ModelBox(babyplates_r3, 60, 129, -0.25F, -7.9804F, -5.7081F, 1, 8, 10, 0.002F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, -0.4261F, -0.4054F);
        this.Plate8.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.384F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 100, 61, -0.5F, -7.9804F, -2.7081F, 1, 8, 10, 0.002F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 5.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 55, 110, -2.0F, -0.0872F, -0.0019F, 5, 7, 7, 0.0F, false));

        this.plate10 = new AdvancedModelRendererExtended(this);
        this.plate10.setRotationPoint(-0.6F, 0.7614F, 5.2427F);
        this.tail3.addChild(plate10);
        this.setRotateAngle(plate10, -0.6196F, 0.0378F, -0.1681F);


        this.babyplates_r4 = new AdvancedModelRendererExtended(this);
        this.babyplates_r4.setRotationPoint(0.0F, -5.78F, 2.7635F);
        this.plate10.addChild(babyplates_r4);
        this.setRotateAngle(babyplates_r4, 0.3709F, 0.0F, 0.0F);
        this.babyplates_r4.cubeList.add(new ModelBox(babyplates_r4, 38, 126, -0.5F, 0.0676F, -7.4423F, 1, 5, 6, 0.002F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, -5.78F, 2.7635F);
        this.plate10.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3709F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 84, 71, -0.5F, 0.0676F, -5.9423F, 1, 5, 6, 0.002F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.0F, -0.4844F, 0.214F);
        this.plate10.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1702F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 90, -0.5F, -5.5763F, -2.3506F, 1, 6, 4, -0.001F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.0F, -0.2504F, 0.3631F);
        this.plate10.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.5018F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 89, 0, -0.5F, -4.9536F, -2.979F, 1, 5, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.5F, 0.2378F, 6.4981F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 98, 0, -2.0F, 0.0F, -1.5F, 4, 5, 9, 0.0F, false));

        this.plate11 = new AdvancedModelRendererExtended(this);
        this.plate11.setRotationPoint(0.6F, 0.5237F, 3.7446F);
        this.tail4.addChild(plate11);
        this.setRotateAngle(plate11, -0.6196F, -0.0378F, 0.1681F);


        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.0F, -5.78F, 2.7635F);
        this.plate11.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3709F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 74, 71, -0.5F, 2.0676F, -3.9423F, 1, 3, 4, -0.001F, false));

        this.babyplates_r5 = new AdvancedModelRendererExtended(this);
        this.babyplates_r5.setRotationPoint(0.0F, -0.4844F, 0.214F);
        this.plate11.addChild(babyplates_r5);
        this.setRotateAngle(babyplates_r5, 0.6152F, 0.0F, 0.0F);
        this.babyplates_r5.cubeList.add(new ModelBox(babyplates_r5, 0, 129, -0.5F, -3.3263F, -1.7506F, 1, 3, 3, 0.002F, false));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(0.0F, -0.4844F, 0.214F);
        this.plate11.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1702F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 48, 71, -0.5F, -3.5763F, -1.7506F, 1, 4, 3, 0.002F, false));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(0.0F, -2.5409F, -2.7556F);
        this.plate11.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.4931F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 23, 90, -0.5F, 0.0123F, -0.0132F, 1, 4, 3, 0.0F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(-0.5F, 0.5F, 7.5F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1309F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 116, -1.0F, 0.0F, -1.0F, 3, 3, 9, 0.0F, false));

        this.plate12 = new AdvancedModelRendererExtended(this);
        this.plate12.setRotationPoint(0.1F, 1.0237F, 0.2446F);
        this.tail5.addChild(plate12);
        this.setRotateAngle(plate12, -0.576F, 0.0378F, -0.1681F);


        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(0.0F, -2.5214F, -2.7718F);
        this.plate12.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.4407F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 44, 92, -0.5F, -2.9757F, 0.0356F, 1, 3, 3, 0.002F, false));

        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(0.0F, -0.4844F, 0.214F);
        this.plate12.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1702F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 51, 0, -0.5F, -3.5763F, -1.3506F, 1, 4, 2, -0.001F, false));

        this.cube_r19 = new AdvancedModelRendererExtended(this);
        this.cube_r19.setRotationPoint(0.0F, -2.5409F, -2.7556F);
        this.plate12.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.4931F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 66, 27, -0.5F, 0.0123F, -0.0132F, 1, 4, 2, 0.0F, false));

        this.plate13 = new AdvancedModelRendererExtended(this);
        this.plate13.setRotationPoint(1.2581F, 0.0523F, 4.0009F);
        this.tail5.addChild(plate13);
        this.setRotateAngle(plate13, -1.0123F, -0.0378F, 0.1681F);


        this.cube_r20 = new AdvancedModelRendererExtended(this);
        this.cube_r20.setRotationPoint(-0.1003F, -0.1689F, -2.142F);
        this.plate13.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.2662F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 58, 36, -0.5F, -2.0757F, 0.1356F, 1, 2, 2, 0.002F, false));

        this.cube_r21 = new AdvancedModelRendererExtended(this);
        this.cube_r21.setRotationPoint(-0.1003F, -0.1738F, -1.9362F);
        this.plate13.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.7287F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 57, 41, -0.5F, -0.0324F, -0.022F, 1, 2, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRendererExtended(this);
        this.cube_r22.setRotationPoint(-0.1003F, -1.5929F, 0.5173F);
        this.plate13.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.336F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 52, 36, -0.5F, -0.0016F, -1.0062F, 1, 2, 1, 0.0F, false));

        this.tail6 = new AdvancedModelRendererExtended(this);
        this.tail6.setRotationPoint(0.5F, 0.3353F, 6.9526F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.2618F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 121, 31, -1.0F, 0.0F, 0.0F, 2, 2, 9, 0.0F, false));

        this.thagomizer = new AdvancedModelRendererExtended(this);
        this.thagomizer.setRotationPoint(-1.0F, 0.5F, 3.0F);
        this.tail6.addChild(thagomizer);
        this.setRotateAngle(thagomizer, 0.0F, 0.2182F, 0.3054F);
        this.thagomizer.cubeList.add(new ModelBox(thagomizer, 66, 43, -8.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));
        this.thagomizer.cubeList.add(new ModelBox(thagomizer, 5, 58, -4.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F, false));

        this.thagomizer3 = new AdvancedModelRendererExtended(this);
        this.thagomizer3.setRotationPoint(1.0F, 0.5F, 3.0F);
        this.tail6.addChild(thagomizer3);
        this.setRotateAngle(thagomizer3, 0.0F, -0.2182F, -0.3054F);
        this.thagomizer3.cubeList.add(new ModelBox(thagomizer3, 66, 43, 4.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, true));
        this.thagomizer3.cubeList.add(new ModelBox(thagomizer3, 5, 58, 0.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F, true));

        this.thagomizer2 = new AdvancedModelRendererExtended(this);
        this.thagomizer2.setRotationPoint(-0.6F, 0.7F, 6.7F);
        this.tail6.addChild(thagomizer2);
        this.setRotateAngle(thagomizer2, 0.0F, 0.5236F, 0.3054F);
        this.thagomizer2.cubeList.add(new ModelBox(thagomizer2, 25, 58, -8.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));
        this.thagomizer2.cubeList.add(new ModelBox(thagomizer2, 51, 9, -4.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F, false));

        this.thagomizer4 = new AdvancedModelRendererExtended(this);
        this.thagomizer4.setRotationPoint(0.6F, 0.7F, 6.7F);
        this.tail6.addChild(thagomizer4);
        this.setRotateAngle(thagomizer4, 0.0F, -0.5236F, -0.3054F);
        this.thagomizer4.cubeList.add(new ModelBox(thagomizer4, 25, 58, 4.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, true));
        this.thagomizer4.cubeList.add(new ModelBox(thagomizer4, 51, 9, 0.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F, true));

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(-0.5F, -35.5F, 3.75F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -9.0F, 0.0236F, -12.917F, 19, 23, 13, 0.0F, false));

        this.plate6 = new AdvancedModelRendererExtended(this);
        this.plate6.setRotationPoint(2.6F, -1.8298F, -6.4796F);
        this.body2.addChild(plate6);
        this.setRotateAngle(plate6, 0.0829F, -0.0522F, 0.1666F);
        this.plate6.cubeList.add(new ModelBox(plate6, 105, 128, -0.5F, -4.4501F, -5.8049F, 1, 9, 9, 0.002F, false));

        this.cube_r23 = new AdvancedModelRendererExtended(this);
        this.cube_r23.setRotationPoint(0.0F, -7.8415F, 1.8708F);
        this.plate6.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.4625F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 98, 14, -0.5F, -3.9877F, -2.8175F, 1, 10, 3, -0.001F, false));

        this.cube_r24 = new AdvancedModelRendererExtended(this);
        this.cube_r24.setRotationPoint(0.0F, -2.2575F, -8.1285F);
        this.plate6.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 1.0559F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 66, 95, -0.5F, -0.1127F, 0.0279F, 1, 3, 12, 0.0F, false));

        this.cube_r25 = new AdvancedModelRendererExtended(this);
        this.cube_r25.setRotationPoint(0.0F, 0.8249F, -1.2049F);
        this.plate6.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.829F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 103, 103, -0.5F, -7.275F, -2.35F, 1, 9, 9, 0.002F, false));

        this.Plate3 = new AdvancedModelRendererExtended(this);
        this.Plate3.setRotationPoint(-1.6F, -0.1608F, -3.3311F);
        this.body2.addChild(Plate3);
        this.setRotateAngle(Plate3, 0.1902F, 0.0844F, -0.2481F);


        this.cube_r26 = new AdvancedModelRendererExtended(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Plate3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0524F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 67, 0, -0.5F, -9.0237F, -3.8125F, 1, 3, 2, -0.002F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 111, -0.5F, -11.0237F, -2.8125F, 1, 11, 3, -0.001F, false));

        this.cube_r27 = new AdvancedModelRendererExtended(this);
        this.cube_r27.setRotationPoint(0.0F, 0.9302F, 0.6958F);
        this.Plate3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.6109F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 84, 87, -0.5F, -7.2251F, -0.1395F, 1, 2, 14, 0.0F, false));

        this.babyplates_r6 = new AdvancedModelRendererExtended(this);
        this.babyplates_r6.setRotationPoint(0.0F, 0.9302F, 0.6958F);
        this.Plate3.addChild(babyplates_r6);
        this.setRotateAngle(babyplates_r6, 1.3003F, 0.0F, 0.0F);
        this.babyplates_r6.cubeList.add(new ModelBox(babyplates_r6, 0, 128, -0.5F, -3.9804F, -1.7081F, 1, 11, 9, 0.002F, false));

        this.cube_r28 = new AdvancedModelRendererExtended(this);
        this.cube_r28.setRotationPoint(0.0F, 0.9302F, 0.6958F);
        this.Plate3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.384F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 15, 107, -0.5F, -6.9804F, -1.7081F, 1, 9, 9, 0.002F, false));

        this.upperbody = new AdvancedModelRendererExtended(this);
        this.upperbody.setRotationPoint(0.0F, 0.0697F, -12.8621F);
        this.body2.addChild(upperbody);
        this.setRotateAngle(upperbody, -0.0873F, 0.0F, 0.0F);
        this.upperbody.cubeList.add(new ModelBox(upperbody, 47, 47, -7.5F, 9.204F, -8.8048F, 16, 13, 11, -0.01F, false));

        this.cube_r29 = new AdvancedModelRendererExtended(this);
        this.cube_r29.setRotationPoint(0.0F, 0.004F, -0.0548F);
        this.upperbody.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.5672F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 36, -7.5F, -0.0129F, -12.9448F, 16, 9, 13, -0.02F, false));

        this.plate7 = new AdvancedModelRendererExtended(this);
        this.plate7.setRotationPoint(2.1F, 2.1005F, -4.6175F);
        this.upperbody.addChild(plate7);
        this.setRotateAngle(plate7, 0.5208F, -0.0306F, 0.1287F);


        this.cube_r30 = new AdvancedModelRendererExtended(this);
        this.cube_r30.setRotationPoint(0.0F, -7.8415F, 1.8708F);
        this.plate7.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.4625F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 38, 58, -0.5F, -3.9877F, -2.8175F, 1, 10, 3, -0.001F, false));

        this.cube_r31 = new AdvancedModelRendererExtended(this);
        this.cube_r31.setRotationPoint(0.0F, -2.2575F, -8.1285F);
        this.plate7.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 1.0559F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 52, 92, -0.5F, -0.1127F, 0.0279F, 1, 3, 12, 0.0F, false));

        this.babyplates_r7 = new AdvancedModelRendererExtended(this);
        this.babyplates_r7.setRotationPoint(0.0F, 0.8249F, -1.2049F);
        this.plate7.addChild(babyplates_r7);
        this.setRotateAngle(babyplates_r7, 0.1309F, 0.0F, 0.0F);
        this.babyplates_r7.cubeList.add(new ModelBox(babyplates_r7, 21, 158, -0.5F, -6.025F, -4.35F, 1, 9, 9, 0.002F, false));

        this.cube_r32 = new AdvancedModelRendererExtended(this);
        this.cube_r32.setRotationPoint(0.0F, 0.8249F, -1.2049F);
        this.plate7.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.829F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 83, 103, -0.5F, -7.275F, -2.35F, 1, 9, 9, 0.002F, false));

        this.plate2 = new AdvancedModelRendererExtended(this);
        this.plate2.setRotationPoint(-1.6F, 0.1005F, 0.3825F);
        this.upperbody.addChild(plate2);
        this.setRotateAngle(plate2, 0.3011F, 0.0522F, -0.1666F);


        this.cube_r33 = new AdvancedModelRendererExtended(this);
        this.cube_r33.setRotationPoint(0.0F, -7.8415F, 1.8708F);
        this.plate2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.4625F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 21, 125, -0.5F, -3.9877F, -2.8175F, 1, 10, 3, -0.001F, false));

        this.cube_r34 = new AdvancedModelRendererExtended(this);
        this.cube_r34.setRotationPoint(0.0F, -2.2575F, -8.1285F);
        this.plate2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 1.0559F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 96, 15, -0.5F, -0.1127F, 0.0279F, 1, 3, 12, 0.0F, false));

        this.babyplates_r8 = new AdvancedModelRendererExtended(this);
        this.babyplates_r8.setRotationPoint(0.0F, 0.8249F, -1.2049F);
        this.plate2.addChild(babyplates_r8);
        this.setRotateAngle(babyplates_r8, 1.6581F, 0.0F, 0.0F);
        this.babyplates_r8.cubeList.add(new ModelBox(babyplates_r8, 0, 156, -0.5F, -4.275F, -2.85F, 1, 9, 9, 0.002F, false));

        this.cube_r35 = new AdvancedModelRendererExtended(this);
        this.cube_r35.setRotationPoint(0.0F, 0.8249F, -1.2049F);
        this.plate2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.829F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 35, 107, -0.5F, -7.275F, -2.35F, 1, 9, 9, 0.002F, false));

        this.plate = new AdvancedModelRendererExtended(this);
        this.plate.setRotationPoint(-0.6F, 6.0918F, -9.9452F);
        this.upperbody.addChild(plate);
        this.setRotateAngle(plate, 0.7375F, 0.0883F, -0.0968F);


        this.babyplates_r9 = new AdvancedModelRendererExtended(this);
        this.babyplates_r9.setRotationPoint(0.0F, -4.2518F, -4.7196F);
        this.plate.addChild(babyplates_r9);
        this.setRotateAngle(babyplates_r9, -0.1789F, 0.0F, 0.0F);
        this.babyplates_r9.cubeList.add(new ModelBox(babyplates_r9, 83, 133, -0.5F, -1.2338F, 1.9316F, 1, 6, 8, 0.002F, false));

        this.cube_r36 = new AdvancedModelRendererExtended(this);
        this.cube_r36.setRotationPoint(0.0F, -4.2518F, -4.7196F);
        this.plate.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.7025F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 95, 121, -0.5F, -6.2338F, -0.3184F, 1, 6, 8, 0.002F, false));

        this.cube_r37 = new AdvancedModelRendererExtended(this);
        this.cube_r37.setRotationPoint(0.0F, 0.7006F, 0.1069F);
        this.plate.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.3971F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 36, -0.5F, -6.1665F, -2.2497F, 1, 6, 5, 0.0F, false));

        this.cube_r38 = new AdvancedModelRendererExtended(this);
        this.cube_r38.setRotationPoint(0.0F, -4.3994F, -4.8931F);
        this.plate.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.432F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 0, -0.5F, -0.1852F, 0.0575F, 1, 8, 5, -0.001F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, 10.2379F, -9.2454F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, 0.0436F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 110, 14, -2.5F, -0.009F, -9.3595F, 6, 7, 6, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 66, 27, -5.5F, -1.009F, -3.3595F, 12, 10, 6, 0.0F, false));

        this.cube_r39 = new AdvancedModelRendererExtended(this);
        this.cube_r39.setRotationPoint(0.5F, -2.509F, -4.8595F);
        this.neck.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.3927F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 73, 121, -2.5F, 0.8F, -5.025F, 5, 5, 6, 0.0F, false));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 90, 43, -6.0F, 0.65F, 0.9F, 12, 5, 5, -0.01F, false));

        this.plate9 = new AdvancedModelRendererExtended(this);
        this.plate9.setRotationPoint(1.6F, -1.9462F, -1.8998F);
        this.neck.addChild(plate9);
        this.setRotateAngle(plate9, 0.6066F, -0.0883F, 0.0968F);


        this.babyplates_r10 = new AdvancedModelRendererExtended(this);
        this.babyplates_r10.setRotationPoint(0.0F, -4.2518F, -4.7196F);
        this.plate9.addChild(babyplates_r10);
        this.setRotateAngle(babyplates_r10, -0.1789F, 0.0F, 0.0F);
        this.babyplates_r10.cubeList.add(new ModelBox(babyplates_r10, 61, 150, -0.5F, -1.2338F, 1.6816F, 1, 4, 5, 0.002F, false));

        this.cube_r40 = new AdvancedModelRendererExtended(this);
        this.cube_r40.setRotationPoint(0.0F, -4.2518F, -4.7196F);
        this.plate9.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.7025F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 45, 36, -0.5F, -4.2338F, 0.6816F, 1, 4, 5, 0.002F, false));

        this.cube_r41 = new AdvancedModelRendererExtended(this);
        this.cube_r41.setRotationPoint(0.0F, -3.6994F, 2.1069F);
        this.plate9.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.1353F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 52, 92, -0.5F, -0.1354F, -3.7926F, 1, 4, 4, 0.0F, false));

        this.cube_r42 = new AdvancedModelRendererExtended(this);
        this.cube_r42.setRotationPoint(0.0F, -4.3994F, -4.8931F);
        this.plate9.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.432F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 13, 90, -0.5F, 0.8148F, 0.0575F, 1, 5, 4, -0.001F, false));

        this.plate14 = new AdvancedModelRendererExtended(this);
        this.plate14.setRotationPoint(-0.5581F, -1.3175F, -6.6435F);
        this.neck.addChild(plate14);
        this.setRotateAngle(plate14, 0.1221F, 0.0378F, -0.1681F);


        this.cube_r43 = new AdvancedModelRendererExtended(this);
        this.cube_r43.setRotationPoint(0.1003F, -0.1738F, -1.9362F);
        this.plate14.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.1745F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 7, 33, 0.5F, -2.0324F, -0.022F, 0, 4, 3, 0.0F, false));

        this.plate15 = new AdvancedModelRendererExtended(this);
        this.plate15.setRotationPoint(1.4581F, -0.3175F, -8.6435F);
        this.neck.addChild(plate15);
        this.setRotateAngle(plate15, -0.096F, -0.0378F, 0.1681F);


        this.cube_r44 = new AdvancedModelRendererExtended(this);
        this.cube_r44.setRotationPoint(-0.1003F, -0.1738F, -1.9362F);
        this.plate15.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.1745F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 0, -0.5216F, -2.0507F, -0.9834F, 0, 3, 2, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.5F, 0.241F, -8.8595F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.2182F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 114, 97, -2.5F, 0.0F, -6.0F, 5, 6, 7, 0.0F, false));

        this.plate17 = new AdvancedModelRendererExtended(this);
        this.plate17.setRotationPoint(0.7581F, 1.1915F, -4.534F);
        this.neck2.addChild(plate17);
        this.setRotateAngle(plate17, -0.4887F, -0.0378F, 0.1681F);


        this.cube_r45 = new AdvancedModelRendererExtended(this);
        this.cube_r45.setRotationPoint(-0.1003F, -0.1738F, -1.9362F);
        this.plate17.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.6981F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 45, 35, -0.5251F, -2.1797F, -1.5094F, 0, 4, 1, 0.0F, false));

        this.plate16 = new AdvancedModelRendererExtended(this);
        this.plate16.setRotationPoint(-0.7581F, 0.3415F, -2.784F);
        this.neck2.addChild(plate16);
        this.setRotateAngle(plate16, -0.4887F, 0.0378F, -0.1681F);


        this.cube_r46 = new AdvancedModelRendererExtended(this);
        this.cube_r46.setRotationPoint(0.1003F, -0.1738F, -1.9362F);
        this.plate16.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.48F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 34, 0.5251F, -1.5053F, -1.1973F, 0, 4, 2, 0.0F, false));

        this.neck3 = new AdvancedModelRendererExtended(this);
        this.neck3.setRotationPoint(0.0F, 0.25F, -6.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.1309F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 124, 42, -2.0F, -0.0436F, -3.4981F, 4, 5, 5, -0.04F, false));

        this.plate18 = new AdvancedModelRendererExtended(this);
        this.plate18.setRotationPoint(-0.7581F, 0.4915F, 0.966F);
        this.neck3.addChild(plate18);
        this.setRotateAngle(plate18, -0.4887F, 0.0378F, -0.1681F);


        this.cube_r47 = new AdvancedModelRendererExtended(this);
        this.cube_r47.setRotationPoint(0.1003F, -0.1738F, -1.9362F);
        this.plate18.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.6109F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 47, 35, 0.521F, -1.7508F, -2.6083F, 0, 3, 1, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.1629F, -3.4031F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.2182F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 90, 53, -2.0F, -0.0736F, -1.0261F, 4, 4, 1, 0.0F, false));

        this.cube_r48 = new AdvancedModelRendererExtended(this);
        this.cube_r48.setRotationPoint(0.0F, 1.2446F, -3.9763F);
        this.head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.3709F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 84, 82, -1.0F, -0.525F, -0.7F, 2, 1, 2, -0.001F, false));

        this.cube_r49 = new AdvancedModelRendererExtended(this);
        this.cube_r49.setRotationPoint(0.5F, -0.0736F, -1.0261F);
        this.head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.1745F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 0, -1.1F, 1.0F, -4.775F, 1, 1, 1, 0.0F, false));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 46, 39, -0.9F, 0.75F, -4.775F, 1, 1, 1, 0.0F, false));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 96, 30, -1.5F, 1.0F, -3.775F, 2, 1, 2, 0.0F, false));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 80, 71, -2.0F, 0.0F, -2.0F, 3, 2, 2, 0.0F, false));

        this.cube_r50 = new AdvancedModelRendererExtended(this);
        this.cube_r50.setRotationPoint(-0.5F, 2.2082F, -5.7328F);
        this.head.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.4669F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 80, 94, -0.1F, -0.6F, -1.175F, 1, 1, 3, -0.01F, false));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 66, 99, 0.1F, -0.6F, -1.175F, 1, 1, 3, -0.013F, false));

        this.cube_r51 = new AdvancedModelRendererExtended(this);
        this.cube_r51.setRotationPoint(0.6727F, 1.7982F, -1.0034F);
        this.head.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.6135F, 0.1719F, 0.0306F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 44, 0.539F, -1.8326F, -3.9082F, 0, 1, 4, 0.0F, true));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 124, 24, 0.5144F, -1.8345F, -3.9122F, 0, 1, 4, 0.0F, true));

        this.cube_r52 = new AdvancedModelRendererExtended(this);
        this.cube_r52.setRotationPoint(-0.6727F, 1.7982F, -1.0034F);
        this.head.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.6135F, -0.1719F, -0.0306F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 124, 24, -0.5144F, -1.8345F, -3.9122F, 0, 1, 4, 0.0F, false));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 44, -0.539F, -1.8326F, -3.9082F, 0, 1, 4, 0.0F, false));

        this.cube_r53 = new AdvancedModelRendererExtended(this);
        this.cube_r53.setRotationPoint(-0.6F, 3.1379F, -6.5663F);
        this.head.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.3957F, -0.1209F, -0.0503F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 84, 43, 0.025F, -0.9647F, -0.0087F, 1, 1, 3, 0.02F, false));

        this.cube_r54 = new AdvancedModelRendererExtended(this);
        this.cube_r54.setRotationPoint(0.6F, 3.1379F, -6.5663F);
        this.head.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.3957F, 0.1209F, 0.0503F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 95, 0, -1.025F, -0.9647F, -0.0087F, 1, 1, 3, 0.023F, false));

        this.cube_r55 = new AdvancedModelRendererExtended(this);
        this.cube_r55.setRotationPoint(0.5F, 2.0824F, -3.4638F);
        this.head.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.176F, 0.1289F, 0.0229F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 43, 0.1F, -0.5F, -1.8F, 0, 1, 4, 0.0F, true));

        this.cube_r56 = new AdvancedModelRendererExtended(this);
        this.cube_r56.setRotationPoint(-0.5F, 2.0824F, -3.4638F);
        this.head.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.176F, -0.1289F, -0.0229F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 0, 43, -0.1F, -0.5F, -1.8F, 0, 1, 4, 0.0F, false));

        this.eye = new AdvancedModelRendererExtended(this);
        this.eye.setRotationPoint(-0.775F, 1.3001F, -3.5487F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, -0.1745F, 0.0F, 0.0F);


        this.cube_r57 = new AdvancedModelRendererExtended(this);
        this.cube_r57.setRotationPoint(0.05F, 0.4945F, -1.2025F);
        this.eye.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.3709F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 8, 47, 0.8F, -0.525F, 1.3F, 1, 1, 1, -0.001F, true));
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 8, 47, -0.35F, -0.525F, 1.3F, 1, 1, 1, -0.001F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 1.9687F, -1.0106F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0044F, 0.0F, 0.0F);


        this.cube_r58 = new AdvancedModelRendererExtended(this);
        this.cube_r58.setRotationPoint(0.0F, 2.2491F, -1.297F);
        this.jaw.addChild(cube_r58);
        this.setRotateAngle(cube_r58, -0.2836F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 84, 87, -1.0F, -1.9787F, -0.4928F, 2, 2, 3, -0.01F, false));

        this.cube_r59 = new AdvancedModelRendererExtended(this);
        this.cube_r59.setRotationPoint(0.5F, -2.0423F, -0.0155F);
        this.jaw.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.1745F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 88, 94, -1.1F, 2.0F, -6.0F, 1, 1, 3, 0.0F, false));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 99, 4, -0.9F, 2.0F, -6.0F, 1, 1, 3, -0.001F, false));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 33, 58, -1.5F, 2.0F, -3.75F, 2, 1, 2, 0.001F, false));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 17, 58, -2.0F, 2.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r60 = new AdvancedModelRendererExtended(this);
        this.cube_r60.setRotationPoint(0.0F, 2.2491F, -1.297F);
        this.jaw.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -0.0567F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 52, 36, -0.5F, -1.1037F, -3.9928F, 1, 1, 4, -0.01F, false));

        this.cube_r61 = new AdvancedModelRendererExtended(this);
        this.cube_r61.setRotationPoint(0.589F, 0.6983F, -3.822F);
        this.jaw.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.1074F, 0.1719F, 0.0306F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 7, 37, -0.2595F, -0.338F, -0.0281F, 0, 1, 3, 0.0F, true));

        this.cube_r62 = new AdvancedModelRendererExtended(this);
        this.cube_r62.setRotationPoint(-0.589F, 0.6983F, -3.822F);
        this.jaw.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.1074F, -0.1719F, -0.0306F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 7, 37, 0.2595F, -0.338F, -0.0281F, 0, 1, 3, 0.0F, false));

        this.cube_r63 = new AdvancedModelRendererExtended(this);
        this.cube_r63.setRotationPoint(1.0F, -0.7102F, -1.8115F);
        this.jaw.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.1772F, 0.1719F, 0.0306F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 45, 43, -0.078F, 0.0F, -2.2903F, 0, 1, 4, 0.0F, true));
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 131, 13, -0.1027F, 0.0F, -2.2946F, 0, 1, 4, 0.0F, true));

        this.cube_r64 = new AdvancedModelRendererExtended(this);
        this.cube_r64.setRotationPoint(-1.0F, -0.7102F, -1.8115F);
        this.jaw.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.1772F, -0.1719F, -0.0306F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 131, 13, 0.1027F, 0.0F, -2.2946F, 0, 1, 4, 0.0F, false));
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 45, 43, 0.078F, 0.0F, -2.2903F, 0, 1, 4, 0.0F, false));

        this.frontrightleg = new AdvancedModelRendererExtended(this);
        this.frontrightleg.setRotationPoint(-5.75F, 17.954F, -2.9298F);
        this.upperbody.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.0F, 0.0F, 0.1745F);


        this.frontrightleg2 = new AdvancedModelRendererExtended(this);
        this.frontrightleg2.setRotationPoint(0.0F, 0.25F, -0.75F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, 0.3054F, 0.0F, 0.0F);
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 117, 115, -2.5F, -1.1388F, -3.4021F, 5, 10, 6, 0.0F, false));

        this.frontrightleg3 = new AdvancedModelRendererExtended(this);
        this.frontrightleg3.setRotationPoint(0.0F, 8.3612F, 1.8479F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, -0.258F, -0.045F, -0.1687F);
        this.frontrightleg3.cubeList.add(new ModelBox(frontrightleg3, 124, 0, -2.1798F, 0.0195F, -4.3637F, 4, 9, 5, 0.0F, false));

        this.frontrightleg4 = new AdvancedModelRendererExtended(this);
        this.frontrightleg4.setRotationPoint(-0.6798F, 8.1695F, -0.8637F);
        this.frontrightleg3.addChild(frontrightleg4);
        this.frontrightleg4.cubeList.add(new ModelBox(frontrightleg4, 51, 0, -2.0F, -1.0834F, -4.5736F, 5, 3, 6, 0.0F, false));

        this.frontleftleg = new AdvancedModelRendererExtended(this);
        this.frontleftleg.setRotationPoint(6.75F, 17.954F, -2.9298F);
        this.upperbody.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.0F, 0.0F, -0.1745F);


        this.frontleftleg2 = new AdvancedModelRendererExtended(this);
        this.frontleftleg2.setRotationPoint(0.0F, 0.25F, -0.75F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, 0.3054F, 0.0F, 0.0F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 117, 115, -2.5F, -1.1388F, -3.4021F, 5, 10, 6, 0.0F, true));

        this.frontleftleg3 = new AdvancedModelRendererExtended(this);
        this.frontleftleg3.setRotationPoint(0.0F, 8.3612F, 1.8479F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, -0.258F, 0.045F, 0.1687F);
        this.frontleftleg3.cubeList.add(new ModelBox(frontleftleg3, 124, 0, -1.8202F, 0.0195F, -4.3637F, 4, 9, 5, 0.0F, true));

        this.frontleftleg4 = new AdvancedModelRendererExtended(this);
        this.frontleftleg4.setRotationPoint(0.6798F, 8.1695F, -0.8637F);
        this.frontleftleg3.addChild(frontleftleg4);
        this.frontleftleg4.cubeList.add(new ModelBox(frontleftleg4, 51, 0, -3.0F, -1.0834F, -4.5736F, 5, 3, 6, 0.0F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {

        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {

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
        //this.main.offsetY = 0.04F;
        //this.resetToDefaultPose();

        EntityPrehistoricFloraStegosaurus kentrosaurus = (EntityPrehistoricFloraStegosaurus) e;

        this.faceTarget(f3, f4, 12, neck);
        this.faceTarget(f3, f4, 12, neck2);
        this.faceTarget(f3, f4, 12, neck3);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        kentrosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (kentrosaurus.getAnimation() == kentrosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!kentrosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !kentrosaurus.getIsMoving()) {
                    if (kentrosaurus.getAnimation() != kentrosaurus.EAT_ANIMATION
                        && kentrosaurus.getAnimation() != kentrosaurus.DRINK_ANIMATION
                        && kentrosaurus.getAnimation() != kentrosaurus.ATTACK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    if (kentrosaurus.getAnimation() != kentrosaurus.ATTACK_ANIMATION) {
                        this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                        this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);
                    }

                    return;
                }

                if (kentrosaurus.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraStegosaurus ee = (EntityPrehistoricFloraStegosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving() && ee.getAnimation() != ee.ATTACK_ANIMATION) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStegosaurus entity = (EntityPrehistoricFloraStegosaurus) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 58) {
            xx = 7.25 + (((tickAnim - 28) / 30) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 30) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 7.25 + (((tickAnim - 58) / 22) * (0-(7.25)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 58) {
            xx = 6 + (((tickAnim - 28) / 30) * (6-(6)));
            yy = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 30) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 6 + (((tickAnim - 58) / 22) * (0-(6)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (18.09961-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (1.14454-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-3.042-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 42) {
            xx = 18.09961 + (((tickAnim - 28) / 14) * (20.59961-(18.09961)));
            yy = 1.14454 + (((tickAnim - 28) / 14) * (1.14454-(1.14454)));
            zz = -3.042 + (((tickAnim - 28) / 14) * (-3.042-(-3.042)));
        }
        else if (tickAnim >= 42 && tickAnim < 58) {
            xx = 20.59961 + (((tickAnim - 42) / 16) * (18.09961-(20.59961)));
            yy = 1.14454 + (((tickAnim - 42) / 16) * (1.14454-(1.14454)));
            zz = -3.042 + (((tickAnim - 42) / 16) * (-3.042-(-3.042)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 18.09961 + (((tickAnim - 58) / 22) * (0-(18.09961)));
            yy = 1.14454 + (((tickAnim - 58) / 22) * (0-(1.14454)));
            zz = -3.042 + (((tickAnim - 58) / 22) * (0-(-3.042)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 28) / 14) * (0-(0)));
            yy = -0.85 + (((tickAnim - 28) / 14) * (-1.03-(-0.85)));
            zz = 0 + (((tickAnim - 28) / 14) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 42) / 38) * (0-(0)));
            yy = -1.03 + (((tickAnim - 42) / 38) * (0-(-1.03)));
            zz = 0 + (((tickAnim - 42) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (25.63119-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (1.01848-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-4.35723-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 42) {
            xx = 25.63119 + (((tickAnim - 28) / 14) * (29.131-(25.63119)));
            yy = 1.01848 + (((tickAnim - 28) / 14) * (1.02138-(1.01848)));
            zz = -4.35723 + (((tickAnim - 28) / 14) * (-4.36967-(-4.35723)));
        }
        else if (tickAnim >= 42 && tickAnim < 58) {
            xx = 29.131 + (((tickAnim - 42) / 16) * (25.63081-(29.131)));
            yy = 1.02138 + (((tickAnim - 42) / 16) * (1.02429-(1.02138)));
            zz = -4.36967 + (((tickAnim - 42) / 16) * (-4.38211-(-4.36967)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 25.63081 + (((tickAnim - 58) / 22) * (0-(25.63081)));
            yy = 1.02429 + (((tickAnim - 58) / 22) * (0-(1.02429)));
            zz = -4.38211 + (((tickAnim - 58) / 22) * (0-(-4.38211)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (5.53845-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0.16763-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-0.45687-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 42) {
            xx = 5.53845 + (((tickAnim - 28) / 14) * (-4.71234-(5.53845)));
            yy = 0.16763 + (((tickAnim - 28) / 14) * (1.33795-(0.16763)));
            zz = -0.45687 + (((tickAnim - 28) / 14) * (-5.33527-(-0.45687)));
        }
        else if (tickAnim >= 42 && tickAnim < 58) {
            xx = -4.71234 + (((tickAnim - 42) / 16) * (6.53766-(-4.71234)));
            yy = 1.33795 + (((tickAnim - 42) / 16) * (1.33795-(1.33795)));
            zz = -5.33527 + (((tickAnim - 42) / 16) * (-5.33527-(-5.33527)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 6.53766 + (((tickAnim - 58) / 22) * (0-(6.53766)));
            yy = 1.33795 + (((tickAnim - 58) / 22) * (0-(1.33795)));
            zz = -5.33527 + (((tickAnim - 58) / 22) * (0-(-5.33527)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            yy = -0.1 + (((tickAnim - 28) / 30) * (-0.3-(-0.1)));
            zz = 0 + (((tickAnim - 28) / 30) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            yy = -0.3 + (((tickAnim - 58) / 22) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 8 + (((tickAnim - 29) / 6) * (0-(8)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 35) / 7) * (8-(0)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 8 + (((tickAnim - 42) / 2) * (8-(8)));
            yy = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 51) {
            xx = 8 + (((tickAnim - 44) / 7) * (0-(8)));
            yy = 0 + (((tickAnim - 44) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 7) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 51) / 7) * (8-(0)));
            yy = 0 + (((tickAnim - 51) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 7) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 8 + (((tickAnim - 58) / 22) * (0-(8)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 2.75 + (((tickAnim - 29) / 6) * (20.03-(2.75)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 20.03 + (((tickAnim - 35) / 7) * (2.75-(20.03)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 2.75 + (((tickAnim - 42) / 2) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 51) {
            xx = 2.75 + (((tickAnim - 44) / 7) * (20.03-(2.75)));
            yy = 0 + (((tickAnim - 44) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 7) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 58) {
            xx = 20.03 + (((tickAnim - 51) / 7) * (0-(20.03)));
            yy = 0 + (((tickAnim - 51) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 7) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-37.75-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 58) {
            xx = -37.75 + (((tickAnim - 29) / 29) * (-37.75-(-37.75)));
            yy = 0 + (((tickAnim - 29) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 29) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -37.75 + (((tickAnim - 58) / 22) * (0-(-37.75)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.05 + (((tickAnim - 0) / 6) * (0.565-(-0.05)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.565 + (((tickAnim - 6) / 7) * (0.875-(0.565)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 0.875 + (((tickAnim - 13) / 8) * (0.7-(0.875)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = 0.7 + (((tickAnim - 21) / 7) * (0.255-(0.7)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            yy = 0.255 + (((tickAnim - 28) / 1) * (-0.075-(0.255)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 29) / 29) * (0-(0)));
            yy = -0.075 + (((tickAnim - 29) / 29) * (-0.075-(-0.075)));
            zz = 0 + (((tickAnim - 29) / 29) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 58) / 5) * (0-(0)));
            yy = -0.075 + (((tickAnim - 58) / 5) * (0.605-(-0.075)));
            zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 63) / 5) * (0-(0)));
            yy = 0.605 + (((tickAnim - 63) / 5) * (0.865-(0.605)));
            zz = 0 + (((tickAnim - 63) / 5) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 68) / 6) * (0-(0)));
            yy = 0.865 + (((tickAnim - 68) / 6) * (0.61-(0.865)));
            zz = 0 + (((tickAnim - 68) / 6) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 74) / 6) * (0-(0)));
            yy = 0.61 + (((tickAnim - 74) / 6) * (-0.05-(0.61)));
            zz = 0 + (((tickAnim - 74) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 58) {
            xx = -21.75 + (((tickAnim - 29) / 29) * (-21.75-(-21.75)));
            yy = 0 + (((tickAnim - 29) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 29) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -21.75 + (((tickAnim - 58) / 22) * (0-(-21.75)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (45.5-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 58) {
            xx = 45.5 + (((tickAnim - 29) / 29) * (45.5-(45.5)));
            yy = 0 + (((tickAnim - 29) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 29) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 45.5 + (((tickAnim - 58) / 22) * (0-(45.5)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg4, frontrightleg4.rotateAngleX + (float) Math.toRadians(xx), frontrightleg4.rotateAngleY + (float) Math.toRadians(yy), frontrightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 1.5 + (((tickAnim - 8) / 14) * (6.75-(1.5)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 6.75 + (((tickAnim - 22) / 7) * (0.5-(6.75)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 58) {
            xx = 0.5 + (((tickAnim - 29) / 29) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 29) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 29) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 77) {
            xx = 0.5 + (((tickAnim - 58) / 19) * (-6-(0.5)));
            yy = 0 + (((tickAnim - 58) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 19) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 80) {
            xx = -6 + (((tickAnim - 77) / 3) * (0-(-6)));
            yy = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            yy = 0.575 + (((tickAnim - 8) / 14) * (0-(0.575)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 2) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 24) / 3) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 2) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 29) / 13) * (0-(0)));
            yy = -0.15 + (((tickAnim - 29) / 13) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 29) / 13) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 42) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 35) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = -29.5 + (((tickAnim - 8) / 14) * (-5.75-(-29.5)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = -5.75 + (((tickAnim - 22) / 7) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 58) {
            xx = -5.75 + (((tickAnim - 29) / 29) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 29) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 29) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 65) {
            xx = -5.75 + (((tickAnim - 58) / 7) * (-27.98-(-5.75)));
            yy = 0 + (((tickAnim - 58) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 7) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 77) {
            xx = -27.98 + (((tickAnim - 65) / 12) * (0-(-27.98)));
            yy = 0 + (((tickAnim - 65) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 12) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.76-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.415-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            yy = 0.76 + (((tickAnim - 11) / 11) * (0-(0.76)));
            zz = 0.415 + (((tickAnim - 11) / 11) * (0-(0.415)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 7) * (0.625-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0.25-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 29) / 29) * (0-(0)));
            yy = 0.625 + (((tickAnim - 29) / 29) * (0.625-(0.625)));
            zz = 0.25 + (((tickAnim - 29) / 29) * (0.25-(0.25)));
        }
        else if (tickAnim >= 58 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 58) / 7) * (0-(0)));
            yy = 0.625 + (((tickAnim - 58) / 7) * (1.42-(0.625)));
            zz = 0.25 + (((tickAnim - 58) / 7) * (0.93-(0.25)));
        }
        else if (tickAnim >= 65 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 65) / 12) * (0-(0)));
            yy = 1.42 + (((tickAnim - 65) / 12) * (0.575-(1.42)));
            zz = 0.93 + (((tickAnim - 65) / 12) * (0-(0.93)));
        }
        else if (tickAnim >= 77 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            yy = 0.575 + (((tickAnim - 77) / 3) * (0-(0.575)));
            zz = 0 + (((tickAnim - 77) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (32.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 32.75 + (((tickAnim - 8) / 11) * (-15.51-(32.75)));
            yy = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 11) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -15.51 + (((tickAnim - 19) / 3) * (-11.75-(-15.51)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = -11.75 + (((tickAnim - 22) / 7) * (-7.25-(-11.75)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 58) {
            xx = -7.25 + (((tickAnim - 29) / 29) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 29) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 29) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 65) {
            xx = -7.25 + (((tickAnim - 58) / 7) * (35.99-(-7.25)));
            yy = 0 + (((tickAnim - 58) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 7) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 73) {
            xx = 35.99 + (((tickAnim - 65) / 8) * (-3.4-(35.99)));
            yy = 0 + (((tickAnim - 65) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 8) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = -3.4 + (((tickAnim - 73) / 4) * (4.75-(-3.4)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 80) {
            xx = 4.75 + (((tickAnim - 77) / 3) * (0-(4.75)));
            yy = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg4, frontleftleg4.rotateAngleX + (float) Math.toRadians(xx), frontleftleg4.rotateAngleY + (float) Math.toRadians(yy), frontleftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            yy = 0.15 + (((tickAnim - 22) / 7) * (0.35-(0.15)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 29) / 29) * (0-(0)));
            yy = 0.35 + (((tickAnim - 29) / 29) * (0.35-(0.35)));
            zz = 0 + (((tickAnim - 29) / 29) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 58) / 3) * (0-(0)));
            yy = 0.35 + (((tickAnim - 58) / 3) * (1.06-(0.35)));
            zz = 0 + (((tickAnim - 58) / 3) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 61) / 4) * (0-(0)));
            yy = 1.06 + (((tickAnim - 61) / 4) * (0.555-(1.06)));
            zz = 0 + (((tickAnim - 61) / 4) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 65) / 12) * (0-(0)));
            yy = 0.555 + (((tickAnim - 65) / 12) * (0-(0.555)));
            zz = 0 + (((tickAnim - 65) / 12) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg4.rotationPointX = this.frontleftleg4.rotationPointX + (float)(xx);
        this.frontleftleg4.rotationPointY = this.frontleftleg4.rotationPointY - (float)(yy);
        this.frontleftleg4.rotationPointZ = this.frontleftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 58) {
            xx = 12.25 + (((tickAnim - 28) / 30) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 30) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 66) {
            xx = 12.25 + (((tickAnim - 58) / 8) * (-5.6-(12.25)));
            yy = 0 + (((tickAnim - 58) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 8) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 73) {
            xx = -5.6 + (((tickAnim - 66) / 7) * (0-(-5.6)));
            yy = 0 + (((tickAnim - 66) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 0) / 73) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 73) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 73) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 73) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 73) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 73) / 2) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 75) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 75) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 75) / 2) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 77) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 77) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 77) / 1) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 78) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 78) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 78) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 30) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 58) / 8) * (30.44-(0)));
            yy = 0 + (((tickAnim - 58) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 8) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 70) {
            xx = 30.44 + (((tickAnim - 66) / 4) * (6.65-(30.44)));
            yy = 0 + (((tickAnim - 66) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 4) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = 6.65 + (((tickAnim - 70) / 3) * (0-(6.65)));
            yy = 0 + (((tickAnim - 70) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 30) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 58) / 8) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 58) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 8) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 73) {
            xx = -0.25 + (((tickAnim - 66) / 7) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 66) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 28 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 30) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 58) / 8) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 58) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 8) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 70) {
            xx = -15.5 + (((tickAnim - 66) / 4) * (1.63-(-15.5)));
            yy = 0 + (((tickAnim - 66) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 4) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = 1.63 + (((tickAnim - 70) / 3) * (0-(1.63)));
            yy = 0 + (((tickAnim - 70) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 30) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 58) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 58) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 58) {
            xx = -12.5 + (((tickAnim - 28) / 30) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 30) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 66) {
            xx = -12.5 + (((tickAnim - 58) / 8) * (6.16-(-12.5)));
            yy = 0 + (((tickAnim - 58) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 8) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 71) {
            xx = 6.16 + (((tickAnim - 66) / 5) * (-14.36-(6.16)));
            yy = 0 + (((tickAnim - 66) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 5) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 73) {
            xx = -14.36 + (((tickAnim - 71) / 2) * (0-(-14.36)));
            yy = 0 + (((tickAnim - 71) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            yy = -0.65 + (((tickAnim - 28) / 30) * (-0.65-(-0.65)));
            zz = 0 + (((tickAnim - 28) / 30) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 58) / 15) * (0-(0)));
            yy = -0.65 + (((tickAnim - 58) / 15) * (0-(-0.65)));
            zz = 0 + (((tickAnim - 58) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg4.rotationPointX = this.backrightleg4.rotationPointX + (float)(xx);
        this.backrightleg4.rotationPointY = this.backrightleg4.rotationPointY - (float)(yy);
        this.backrightleg4.rotationPointZ = this.backrightleg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(0), frontleftleg.rotateAngleY + (float) Math.toRadians(0), frontleftleg.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+50))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+150))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+50))*-1));

        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+190))*2.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-170))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-170))*2.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+200))*-5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+220))*3), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+220))*-5));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+250))*1), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+250))*-1));
    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStegosaurus entity = (EntityPrehistoricFloraStegosaurus) entitylivingbaseIn;

        int animCycle = 44;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = -4 + (((tickAnim - 9) / 16) * (0-(-4)));
            yy = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 16) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 25) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 11 + (((tickAnim - 20) / 24) * (0-(11)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -9 + (((tickAnim - 9) / 11) * (-12-(-9)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = -12 + (((tickAnim - 20) / 24) * (0-(-12)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -6 + (((tickAnim - 20) / 10) * (-6.52-(-6)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 44) {
            xx = -6.52 + (((tickAnim - 30) / 14) * (0-(-6.52)));
            yy = 0 + (((tickAnim - 30) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 10 + (((tickAnim - 9) / 8) * (24-(10)));
            yy = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 24 + (((tickAnim - 17) / 17) * (24-(24)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 24 + (((tickAnim - 34) / 5) * (0-(24)));
            yy = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 17) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 22) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 3) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 27) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 3) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 32) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 39) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 39) / 2) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 41) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(xx);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(yy);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(zz);

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStegosaurus entity = (EntityPrehistoricFloraStegosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(0), backrightleg.rotateAngleY + (float) Math.toRadians(0), backrightleg.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(0), backrightleg2.rotateAngleY + (float) Math.toRadians(0), backrightleg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(0), backrightleg3.rotateAngleY + (float) Math.toRadians(0), backrightleg3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(0), backrightleg4.rotateAngleY + (float) Math.toRadians(0), backrightleg4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 27) {
            xx = 18.5 + (((tickAnim - 14) / 13) * (0-(18.5)));
            yy = 0 + (((tickAnim - 14) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 13) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 27) / 11) * (18.5-(0)));
            yy = 0 + (((tickAnim - 27) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 11) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 18.5 + (((tickAnim - 38) / 12) * (0-(18.5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (1.425-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 1.425 + (((tickAnim - 20) / 7) * (0-(1.425)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (1.425-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 1.425 + (((tickAnim - 43) / 7) * (0-(1.425)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 24 + (((tickAnim - 20) / 7) * (0-(24)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 27) / 16) * (24-(0)));
            yy = 0 + (((tickAnim - 27) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 16) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 24 + (((tickAnim - 43) / 7) * (0-(24)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 8) / 19) * (0-(0)));
            yy = -0.25 + (((tickAnim - 8) / 19) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 8) / 19) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 6) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -0.25 + (((tickAnim - 33) / 17) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -9.5 + (((tickAnim - 8) / 12) * (0.25-(-9.5)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0.25 + (((tickAnim - 20) / 7) * (0-(0.25)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -9.5 + (((tickAnim - 33) / 10) * (0.25-(-9.5)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0.25 + (((tickAnim - 43) / 7) * (0-(0.25)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0.55-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0.55 + (((tickAnim - 9) / 11) * (15.75-(0.55)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 15.75 + (((tickAnim - 20) / 3) * (-11.62-(15.75)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -11.62 + (((tickAnim - 23) / 2) * (-14.81-(-11.62)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = -14.81 + (((tickAnim - 25) / 2) * (0-(-14.81)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (0.55-(0)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0.55 + (((tickAnim - 33) / 10) * (15.75-(0.55)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = 15.75 + (((tickAnim - 43) / 4) * (-11.62-(15.75)));
            yy = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = -11.62 + (((tickAnim - 47) / 1) * (-14.81-(-11.62)));
            yy = 0 + (((tickAnim - 47) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 1) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -14.81 + (((tickAnim - 48) / 2) * (0-(-14.81)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+150))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+190))*2.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+190))*-3));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+200))*3.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+200))*-5));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+220))*3), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+220))*-5));
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*1), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(0), upperbody.rotateAngleY + (float) Math.toRadians(0), upperbody.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0.30588-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-8.65742-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-2.02113-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 0.30588 + (((tickAnim - 16) / 17) * (0.6592-(0.30588)));
            yy = -8.65742 + (((tickAnim - 16) / 17) * (-10.03833-(-8.65742)));
            zz = -2.02113 + (((tickAnim - 16) / 17) * (-4.37723-(-2.02113)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0.6592 + (((tickAnim - 33) / 17) * (0-(0.6592)));
            yy = -10.03833 + (((tickAnim - 33) / 17) * (0-(-10.03833)));
            zz = -4.37723 + (((tickAnim - 33) / 17) * (0-(-4.37723)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-23-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            yy = -23 + (((tickAnim - 16) / 17) * (-23-(-23)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -23 + (((tickAnim - 33) / 17) * (0-(-23)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-28-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            yy = -28 + (((tickAnim - 16) / 17) * (-28-(-28)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -28 + (((tickAnim - 33) / 17) * (0-(-28)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-2-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            yy = -2 + (((tickAnim - 16) / 17) * (-2-(-2)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -2 + (((tickAnim - 33) / 17) * (0-(-2)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(0), frontrightleg.rotateAngleY + (float) Math.toRadians(0), frontrightleg.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(0), frontrightleg2.rotateAngleY + (float) Math.toRadians(0), frontrightleg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(0), frontrightleg3.rotateAngleY + (float) Math.toRadians(0), frontrightleg3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(frontrightleg4, frontrightleg4.rotateAngleX + (float) Math.toRadians(0), frontrightleg4.rotateAngleY + (float) Math.toRadians(0), frontrightleg4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(0), frontleftleg.rotateAngleY + (float) Math.toRadians(0), frontleftleg.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(0), frontleftleg2.rotateAngleY + (float) Math.toRadians(0), frontleftleg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(0), frontleftleg3.rotateAngleY + (float) Math.toRadians(0), frontleftleg3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(frontleftleg4, frontleftleg4.rotateAngleX + (float) Math.toRadians(0), frontleftleg4.rotateAngleY + (float) Math.toRadians(0), frontleftleg4.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStegosaurus entity = (EntityPrehistoricFloraStegosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -11.5 + (((tickAnim - 19) / 12) * (-11.5-(-11.5)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -11.5 + (((tickAnim - 31) / 19) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-5.5-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = -5.5 + (((tickAnim - 19) / 12) * (-5.5-(-5.5)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = -5.5 + (((tickAnim - 31) / 19) * (0-(-5.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 17 + (((tickAnim - 19) / 12) * (17-(17)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 31) / 19) * (0-(17)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 21.75 + (((tickAnim - 19) / 12) * (21.75-(21.75)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 21.75 + (((tickAnim - 31) / 19) * (0-(21.75)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-26.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -26.25 + (((tickAnim - 19) / 12) * (-26.25-(-26.25)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -26.25 + (((tickAnim - 31) / 19) * (0-(-26.25)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 17 + (((tickAnim - 19) / 12) * (17-(17)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 31) / 19) * (0-(17)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 21.75 + (((tickAnim - 19) / 12) * (21.75-(21.75)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 21.75 + (((tickAnim - 31) / 19) * (0-(21.75)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-26.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -26.25 + (((tickAnim - 19) / 12) * (-26.25-(-26.25)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -26.25 + (((tickAnim - 31) / 19) * (0-(-26.25)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+150))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+190))*2.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+190))*-3));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+200))*3.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+200))*-5));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+220))*3), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+220))*-5));
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*1), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1));



        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 4.25 + (((tickAnim - 19) / 12) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 4.25 + (((tickAnim - 31) / 19) * (0-(4.25)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 5 + (((tickAnim - 19) / 12) * (5-(5)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 31) / 19) * (0-(5)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-6-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 16) / 11) * (0-(0)));
            yy = -6 + (((tickAnim - 16) / 11) * (-12-(-6)));
            zz = 0 + (((tickAnim - 16) / 11) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = -12 + (((tickAnim - 27) / 8) * (-13.75-(-12)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -13.75 + (((tickAnim - 35) / 15) * (0-(-13.75)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-7.25-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 16) / 11) * (0-(0)));
            yy = -7.25 + (((tickAnim - 16) / 11) * (-13.5-(-7.25)));
            zz = 0 + (((tickAnim - 16) / 11) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = -13.5 + (((tickAnim - 27) / 8) * (-19.5-(-13.5)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -19.5 + (((tickAnim - 35) / 15) * (0-(-19.5)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 16) / 11) * (0-(0)));
            yy = -5 + (((tickAnim - 16) / 11) * (-14-(-5)));
            zz = 0 + (((tickAnim - 16) / 11) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = -14 + (((tickAnim - 27) / 8) * (-19.75-(-14)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -19.75 + (((tickAnim - 35) / 15) * (0-(-19.75)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 16) / 11) * (0-(0)));
            yy = -7.5 + (((tickAnim - 16) / 11) * (-12.25-(-7.5)));
            zz = 0 + (((tickAnim - 16) / 11) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = -12.25 + (((tickAnim - 27) / 8) * (-12.25-(-12.25)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -12.25 + (((tickAnim - 35) / 15) * (0-(-12.25)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(0), frontrightleg2.rotateAngleY + (float) Math.toRadians(0), frontrightleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(0), frontleftleg2.rotateAngleY + (float) Math.toRadians(0), frontleftleg2.rotateAngleZ + (float) Math.toRadians(0));
    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStegosaurus entity = (EntityPrehistoricFloraStegosaurus) entitylivingbaseIn;

        int animCycle = 70;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 7.25 + (((tickAnim - 28) / 20) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 7.25 + (((tickAnim - 48) / 22) * (0-(7.25)));
            yy = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 6 + (((tickAnim - 28) / 20) * (6-(6)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 6 + (((tickAnim - 48) / 22) * (0-(6)));
            yy = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (18.09961-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (1.14454-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-3.042-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 18.09961 + (((tickAnim - 28) / 8) * (20.59961-(18.09961)));
            yy = 1.14454 + (((tickAnim - 28) / 8) * (1.14454-(1.14454)));
            zz = -3.042 + (((tickAnim - 28) / 8) * (-3.042-(-3.042)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 20.59961 + (((tickAnim - 36) / 12) * (18.09961-(20.59961)));
            yy = 1.14454 + (((tickAnim - 36) / 12) * (1.14454-(1.14454)));
            zz = -3.042 + (((tickAnim - 36) / 12) * (-3.042-(-3.042)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 18.09961 + (((tickAnim - 48) / 22) * (0-(18.09961)));
            yy = 1.14454 + (((tickAnim - 48) / 22) * (0-(1.14454)));
            zz = -3.042 + (((tickAnim - 48) / 22) * (0-(-3.042)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            yy = -0.85 + (((tickAnim - 28) / 8) * (-1.03-(-0.85)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 36) / 34) * (0-(0)));
            yy = -1.03 + (((tickAnim - 36) / 34) * (0-(-1.03)));
            zz = 0 + (((tickAnim - 36) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (25.63119-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (1.01848-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-4.35723-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 25.63119 + (((tickAnim - 28) / 8) * (29.131-(25.63119)));
            yy = 1.01848 + (((tickAnim - 28) / 8) * (1.02138-(1.01848)));
            zz = -4.35723 + (((tickAnim - 28) / 8) * (-4.36967-(-4.35723)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 29.131 + (((tickAnim - 36) / 12) * (25.63081-(29.131)));
            yy = 1.02138 + (((tickAnim - 36) / 12) * (1.02429-(1.02138)));
            zz = -4.36967 + (((tickAnim - 36) / 12) * (-4.38211-(-4.36967)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 25.63081 + (((tickAnim - 48) / 22) * (0-(25.63081)));
            yy = 1.02429 + (((tickAnim - 48) / 22) * (0-(1.02429)));
            zz = -4.38211 + (((tickAnim - 48) / 22) * (0-(-4.38211)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (5.53845-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0.16763-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-0.45687-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 5.53845 + (((tickAnim - 28) / 8) * (-4.71234-(5.53845)));
            yy = 0.16763 + (((tickAnim - 28) / 8) * (1.33795-(0.16763)));
            zz = -0.45687 + (((tickAnim - 28) / 8) * (-5.33527-(-0.45687)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = -4.71234 + (((tickAnim - 36) / 12) * (6.53766-(-4.71234)));
            yy = 1.33795 + (((tickAnim - 36) / 12) * (1.33795-(1.33795)));
            zz = -5.33527 + (((tickAnim - 36) / 12) * (-5.33527-(-5.33527)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 6.53766 + (((tickAnim - 48) / 22) * (0-(6.53766)));
            yy = 1.33795 + (((tickAnim - 48) / 22) * (0-(1.33795)));
            zz = -5.33527 + (((tickAnim - 48) / 22) * (0-(-5.33527)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = -0.1 + (((tickAnim - 28) / 20) * (-0.3-(-0.1)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            yy = -0.3 + (((tickAnim - 48) / 22) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 8 + (((tickAnim - 29) / 7) * (0-(8)));
            yy = 0 + (((tickAnim - 29) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 7) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (8-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 70) {
            xx = 8 + (((tickAnim - 43) / 27) * (0-(8)));
            yy = 0 + (((tickAnim - 43) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 2.75 + (((tickAnim - 29) / 7) * (20.03-(2.75)));
            yy = 0 + (((tickAnim - 29) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 7) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 20.03 + (((tickAnim - 36) / 7) * (0-(20.03)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 43) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-37.75-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = -37.75 + (((tickAnim - 29) / 19) * (-37.75-(-37.75)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = -37.75 + (((tickAnim - 48) / 22) * (0-(-37.75)));
            yy = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.05 + (((tickAnim - 0) / 6) * (0.565-(-0.05)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.565 + (((tickAnim - 6) / 7) * (0.875-(0.565)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 0.875 + (((tickAnim - 13) / 8) * (0.7-(0.875)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = 0.7 + (((tickAnim - 21) / 7) * (0.255-(0.7)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            yy = 0.255 + (((tickAnim - 28) / 1) * (-0.075-(0.255)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            yy = -0.075 + (((tickAnim - 29) / 19) * (-0.075-(-0.075)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            yy = -0.075 + (((tickAnim - 48) / 5) * (0.605-(-0.075)));
            zz = 0 + (((tickAnim - 48) / 5) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            yy = 0.605 + (((tickAnim - 53) / 5) * (0.865-(0.605)));
            zz = 0 + (((tickAnim - 53) / 5) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 58) / 6) * (0-(0)));
            yy = 0.865 + (((tickAnim - 58) / 6) * (0.61-(0.865)));
            zz = 0 + (((tickAnim - 58) / 6) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 64) / 6) * (0-(0)));
            yy = 0.61 + (((tickAnim - 64) / 6) * (-0.05-(0.61)));
            zz = 0 + (((tickAnim - 64) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = -21.75 + (((tickAnim - 29) / 19) * (-21.75-(-21.75)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = -21.75 + (((tickAnim - 48) / 22) * (0-(-21.75)));
            yy = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (45.5-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = 45.5 + (((tickAnim - 29) / 19) * (45.5-(45.5)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 45.5 + (((tickAnim - 48) / 22) * (0-(45.5)));
            yy = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg4, frontrightleg4.rotateAngleX + (float) Math.toRadians(xx), frontrightleg4.rotateAngleY + (float) Math.toRadians(yy), frontrightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 1.5 + (((tickAnim - 8) / 14) * (6.75-(1.5)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 6.75 + (((tickAnim - 22) / 7) * (0.5-(6.75)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = 0.5 + (((tickAnim - 29) / 19) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 67) {
            xx = 0.5 + (((tickAnim - 48) / 19) * (-6-(0.5)));
            yy = 0 + (((tickAnim - 48) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 19) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = -6 + (((tickAnim - 67) / 3) * (0-(-6)));
            yy = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            yy = 0.575 + (((tickAnim - 8) / 14) * (0-(0.575)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 2) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 24) / 3) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 2) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 29) / 3) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 32) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 35) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = -29.5 + (((tickAnim - 8) / 14) * (-5.75-(-29.5)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = -5.75 + (((tickAnim - 22) / 7) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = -5.75 + (((tickAnim - 29) / 19) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = -5.75 + (((tickAnim - 48) / 7) * (-27.98-(-5.75)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 67) {
            xx = -27.98 + (((tickAnim - 55) / 12) * (0-(-27.98)));
            yy = 0 + (((tickAnim - 55) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 12) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.76-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.415-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            yy = 0.76 + (((tickAnim - 11) / 11) * (0-(0.76)));
            zz = 0.415 + (((tickAnim - 11) / 11) * (0-(0.415)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 7) * (0.625-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0.25-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            yy = 0.625 + (((tickAnim - 29) / 19) * (0.625-(0.625)));
            zz = 0.25 + (((tickAnim - 29) / 19) * (0.25-(0.25)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            yy = 0.625 + (((tickAnim - 48) / 7) * (1.42-(0.625)));
            zz = 0.25 + (((tickAnim - 48) / 7) * (0.93-(0.25)));
        }
        else if (tickAnim >= 55 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 55) / 12) * (0-(0)));
            yy = 1.42 + (((tickAnim - 55) / 12) * (0.575-(1.42)));
            zz = 0.93 + (((tickAnim - 55) / 12) * (0-(0.93)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            yy = 0.575 + (((tickAnim - 67) / 3) * (0-(0.575)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (32.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 32.75 + (((tickAnim - 8) / 11) * (-15.51-(32.75)));
            yy = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 11) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -15.51 + (((tickAnim - 19) / 3) * (-11.75-(-15.51)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = -11.75 + (((tickAnim - 22) / 7) * (-7.25-(-11.75)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = -7.25 + (((tickAnim - 29) / 19) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = -7.25 + (((tickAnim - 48) / 7) * (35.99-(-7.25)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 63) {
            xx = 35.99 + (((tickAnim - 55) / 8) * (-3.4-(35.99)));
            yy = 0 + (((tickAnim - 55) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 8) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
            xx = -3.4 + (((tickAnim - 63) / 4) * (4.75-(-3.4)));
            yy = 0 + (((tickAnim - 63) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 4) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = 4.75 + (((tickAnim - 67) / 3) * (0-(4.75)));
            yy = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg4, frontleftleg4.rotateAngleX + (float) Math.toRadians(xx), frontleftleg4.rotateAngleY + (float) Math.toRadians(yy), frontleftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            yy = 0.15 + (((tickAnim - 22) / 7) * (0.35-(0.15)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            yy = 0.35 + (((tickAnim - 29) / 19) * (0.35-(0.35)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 48) / 3) * (0-(0)));
            yy = 0.35 + (((tickAnim - 48) / 3) * (1.06-(0.35)));
            zz = 0 + (((tickAnim - 48) / 3) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 51) / 4) * (0-(0)));
            yy = 1.06 + (((tickAnim - 51) / 4) * (0.555-(1.06)));
            zz = 0 + (((tickAnim - 51) / 4) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 55) / 12) * (0-(0)));
            yy = 0.555 + (((tickAnim - 55) / 12) * (0-(0.555)));
            zz = 0 + (((tickAnim - 55) / 12) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg4.rotationPointX = this.frontleftleg4.rotationPointX + (float)(xx);
        this.frontleftleg4.rotationPointY = this.frontleftleg4.rotationPointY - (float)(yy);
        this.frontleftleg4.rotationPointZ = this.frontleftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 12.25 + (((tickAnim - 28) / 20) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 12.25 + (((tickAnim - 48) / 8) * (-5.6-(12.25)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 63) {
            xx = -5.6 + (((tickAnim - 56) / 7) * (0-(-5.6)));
            yy = 0 + (((tickAnim - 56) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 63) / 2) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 65) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 65) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 65) / 2) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 67) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 67) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 67) / 1) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 68) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 68) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 68) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 48) / 8) * (30.44-(0)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 30.44 + (((tickAnim - 56) / 4) * (6.65-(30.44)));
            yy = 0 + (((tickAnim - 56) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 4) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 6.65 + (((tickAnim - 60) / 3) * (0-(6.65)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 48) / 8) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 63) {
            xx = -0.25 + (((tickAnim - 56) / 7) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 56) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 48) / 8) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = -15.5 + (((tickAnim - 56) / 4) * (1.63-(-15.5)));
            yy = 0 + (((tickAnim - 56) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 4) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 1.63 + (((tickAnim - 60) / 3) * (0-(1.63)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = -12.5 + (((tickAnim - 28) / 20) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = -12.5 + (((tickAnim - 48) / 8) * (6.16-(-12.5)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 61) {
            xx = 6.16 + (((tickAnim - 56) / 5) * (-14.36-(6.16)));
            yy = 0 + (((tickAnim - 56) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 5) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 63) {
            xx = -14.36 + (((tickAnim - 61) / 2) * (0-(-14.36)));
            yy = 0 + (((tickAnim - 61) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = -0.65 + (((tickAnim - 28) / 20) * (-0.65-(-0.65)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            yy = -0.65 + (((tickAnim - 48) / 15) * (0-(-0.65)));
            zz = 0 + (((tickAnim - 48) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg4.rotationPointX = this.backrightleg4.rotationPointX + (float)(xx);
        this.backrightleg4.rotationPointY = this.backrightleg4.rotationPointY - (float)(yy);
        this.backrightleg4.rotationPointZ = this.backrightleg4.rotationPointZ + (float)(zz);
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(0), frontleftleg.rotateAngleY + (float) Math.toRadians(0), frontleftleg.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+50))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+150))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+50))*-1));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+190))*2.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+190))*-3));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+200))*3.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+200))*-5));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+220))*3), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+220))*-5));
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+250))*1), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+250))*-1));

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStegosaurus entity = (EntityPrehistoricFloraStegosaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (5.85436-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (45.29103-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 5.85436 + (((tickAnim - 8) / 10) * (5.357-(5.85436)));
            yy = 45.29103 + (((tickAnim - 8) / 10) * (120.2532-(45.29103)));
            zz = 0 + (((tickAnim - 8) / 10) * (10.89405-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 5.357 + (((tickAnim - 18) / 22) * (0-(5.357)));
            yy = 120.2532 + (((tickAnim - 18) / 22) * (0-(120.2532)));
            zz = 10.89405 + (((tickAnim - 18) / 22) * (0-(10.89405)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-1.025-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = -1.025 + (((tickAnim - 18) / 22) * (0-(-1.025)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -30.75 + (((tickAnim - 0) / 13) * (-5.13425-(-30.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.48208-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-2.19778-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -5.13425 + (((tickAnim - 13) / 5) * (0-(-5.13425)));
            yy = 0.48208 + (((tickAnim - 13) / 5) * (0-(0.48208)));
            zz = -2.19778 + (((tickAnim - 13) / 5) * (0-(-2.19778)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 18) / 16) * (-30.75-(0)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.575 + (((tickAnim - 0) / 4) * (1.005-(-0.575)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 1.005 + (((tickAnim - 4) / 3) * (1.73-(1.005)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 1.73 + (((tickAnim - 7) / 1) * (2.065-(1.73)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 2.065 + (((tickAnim - 8) / 0) * (2.085-(2.065)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 2.085 + (((tickAnim - 8) / 1) * (1.96-(2.085)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 1.96 + (((tickAnim - 9) / 4) * (0.95-(1.96)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.95 + (((tickAnim - 13) / 5) * (-1.475-(0.95)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            yy = -1.475 + (((tickAnim - 18) / 16) * (-0.575-(-1.475)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = -0.575 + (((tickAnim - 34) / 6) * (-0.72-(-0.575)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (-40-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = -40 + (((tickAnim - 25) / 9) * (0-(-40)));
            yy = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(0);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(0);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 30.25 + (((tickAnim - 0) / 9) * (7.36-(30.25)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 7.36 + (((tickAnim - 9) / 9) * (2.5-(7.36)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 2.5 + (((tickAnim - 18) / 7) * (67.51-(2.5)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 67.51 + (((tickAnim - 25) / 6) * (2.46-(67.51)));
            yy = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 6) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 2.46 + (((tickAnim - 31) / 3) * (30.25-(2.46)));
            yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg4, frontleftleg4.rotateAngleX + (float) Math.toRadians(xx), frontleftleg4.rotateAngleY + (float) Math.toRadians(yy), frontleftleg4.rotateAngleZ + (float) Math.toRadians(zz));

        this.frontleftleg4.rotationPointX = this.frontleftleg4.rotationPointX + (float)(0);
        this.frontleftleg4.rotationPointY = this.frontleftleg4.rotationPointY - (float)(0);
        this.frontleftleg4.rotationPointZ = this.frontleftleg4.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10.66302-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (14.29062-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (9.83721-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 10.66302 + (((tickAnim - 18) / 5) * (-0.37-(10.66302)));
            yy = 14.29062 + (((tickAnim - 18) / 5) * (0-(14.29062)));
            zz = 9.83721 + (((tickAnim - 18) / 5) * (0-(9.83721)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = -0.37 + (((tickAnim - 23) / 8) * (-13.86-(-0.37)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = -13.86 + (((tickAnim - 31) / 3) * (0-(-13.86)));
            yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.445-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -0.445 + (((tickAnim - 4) / 4) * (-1.275-(-0.445)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -1.275 + (((tickAnim - 8) / 5) * (0.555-(-1.275)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.555 + (((tickAnim - 13) / 5) * (2.215-(0.555)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            yy = 2.215 + (((tickAnim - 18) / 16) * (0-(2.215)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (6.29999-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.92052-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-4.34525-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 6.29999 + (((tickAnim - 8) / 5) * (10.74779-(6.29999)));
            yy = 1.92052 + (((tickAnim - 8) / 5) * (3.84418-(1.92052)));
            zz = -4.34525 + (((tickAnim - 8) / 5) * (-7.47898-(-4.34525)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 10.74779 + (((tickAnim - 13) / 5) * (14.37-(10.74779)));
            yy = 3.84418 + (((tickAnim - 13) / 5) * (0-(3.84418)));
            zz = -7.47898 + (((tickAnim - 13) / 5) * (0-(-7.47898)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 14.37 + (((tickAnim - 18) / 5) * (30.75-(14.37)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 30.75 + (((tickAnim - 23) / 11) * (0-(30.75)));
            yy = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.165-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0.165 + (((tickAnim - 8) / 10) * (-1.3-(0.165)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (-0.14-(0)));
            yy = -1.3 + (((tickAnim - 18) / 5) * (-0.385-(-1.3)));
            zz = 0 + (((tickAnim - 18) / 5) * (-0.75-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = -0.14 + (((tickAnim - 23) / 8) * (-0.375-(-0.14)));
            yy = -0.385 + (((tickAnim - 23) / 8) * (-0.26-(-0.385)));
            zz = -0.75 + (((tickAnim - 23) / 8) * (0-(-0.75)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = -0.375 + (((tickAnim - 31) / 3) * (0-(-0.375)));
            yy = -0.26 + (((tickAnim - 31) / 3) * (0-(-0.26)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-5.29-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = -5.29 + (((tickAnim - 18) / 16) * (0-(-5.29)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-12.78-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -12.78 + (((tickAnim - 8) / 10) * (-14.69915-(-12.78)));
            yy = 0 + (((tickAnim - 8) / 10) * (-0.5712-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (-2.17632-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -14.69915 + (((tickAnim - 18) / 5) * (13.5-(-14.69915)));
            yy = -0.5712 + (((tickAnim - 18) / 5) * (0-(-0.5712)));
            zz = -2.17632 + (((tickAnim - 18) / 5) * (0-(-2.17632)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 13.5 + (((tickAnim - 23) / 8) * (-7.7-(13.5)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = -7.7 + (((tickAnim - 31) / 3) * (0-(-7.7)));
            yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = -13 + (((tickAnim - 7) / 11) * (-16.5-(-13)));
            yy = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = -16.5 + (((tickAnim - 18) / 18) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 18) / 3) * (0.13-(0.175)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            yy = 0.13 + (((tickAnim - 21) / 3) * (0.525-(0.13)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 24) / 12) * (0-(0)));
            yy = 0.525 + (((tickAnim - 24) / 12) * (0-(0.525)));
            zz = 0 + (((tickAnim - 24) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (32.47716-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-6.79703-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-8.02203-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 32.47716 + (((tickAnim - 7) / 11) * (7.75-(32.47716)));
            yy = -6.79703 + (((tickAnim - 7) / 11) * (0-(-6.79703)));
            zz = -8.02203 + (((tickAnim - 7) / 11) * (0-(-8.02203)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = 7.75 + (((tickAnim - 18) / 18) * (0-(7.75)));
            yy = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 7 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 7) / 11) * (0.4-(0)));
            yy = 0 + (((tickAnim - 7) / 11) * (-0.73-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0.59-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0.4 + (((tickAnim - 18) / 1) * (0.36-(0.4)));
            yy = -0.73 + (((tickAnim - 18) / 1) * (-0.67-(-0.73)));
            zz = 0.59 + (((tickAnim - 18) / 1) * (0.53-(0.59)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0.36 + (((tickAnim - 19) / 2) * (0.5-(0.36)));
            yy = -0.67 + (((tickAnim - 19) / 2) * (-0.75-(-0.67)));
            zz = 0.53 + (((tickAnim - 19) / 2) * (0-(0.53)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0.5 + (((tickAnim - 21) / 2) * (0.36-(0.5)));
            yy = -0.75 + (((tickAnim - 21) / 2) * (-0.145-(-0.75)));
            zz = 0 + (((tickAnim - 21) / 2) * (0.53-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0.36 + (((tickAnim - 23) / 1) * (0-(0.36)));
            yy = -0.145 + (((tickAnim - 23) / 1) * (0-(-0.145)));
            zz = 0.53 + (((tickAnim - 23) / 1) * (0-(0.53)));
        }
        else if (tickAnim >= 24 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 24) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = -20.5 + (((tickAnim - 7) / 11) * (7.5-(-20.5)));
            yy = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = 7.5 + (((tickAnim - 18) / 18) * (0-(7.5)));
            yy = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 18 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (24.01-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 24.01 + (((tickAnim - 7) / 5) * (-8.65-(24.01)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -8.65 + (((tickAnim - 12) / 6) * (7.99-(-8.65)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = 7.99 + (((tickAnim - 18) / 18) * (0-(7.99)));
            yy = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            yy = 0.225 + (((tickAnim - 18) / 18) * (0-(0.225)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg4.rotationPointX = this.backleftleg4.rotationPointX + (float)(xx);
        this.backleftleg4.rotationPointY = this.backleftleg4.rotationPointY - (float)(yy);
        this.backleftleg4.rotationPointZ = this.backleftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.66053-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-7.71609-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (4.21469-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -1.66053 + (((tickAnim - 5) / 4) * (-3.04458-(-1.66053)));
            yy = -7.71609 + (((tickAnim - 5) / 4) * (-10.45542-(-7.71609)));
            zz = 4.21469 + (((tickAnim - 5) / 4) * (7.68833-(4.21469)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -3.04458 + (((tickAnim - 9) / 9) * (-3.77575-(-3.04458)));
            yy = -10.45542 + (((tickAnim - 9) / 9) * (27.30419-(-10.45542)));
            zz = 7.68833 + (((tickAnim - 9) / 9) * (-11.44316-(7.68833)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -3.77575 + (((tickAnim - 18) / 5) * (-2.84473-(-3.77575)));
            yy = 27.30419 + (((tickAnim - 18) / 5) * (23.45068-(27.30419)));
            zz = -11.44316 + (((tickAnim - 18) / 5) * (-8.61508-(-11.44316)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = -2.84473 + (((tickAnim - 23) / 13) * (0-(-2.84473)));
            yy = 23.45068 + (((tickAnim - 23) / 13) * (0-(23.45068)));
            zz = -8.61508 + (((tickAnim - 23) / 13) * (0-(-8.61508)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            yy = -0.775 + (((tickAnim - 18) / 18) * (0-(-0.775)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.394-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-3.7628-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (5.46462-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -0.394 + (((tickAnim - 5) / 4) * (0.96965-(-0.394)));
            yy = -3.7628 + (((tickAnim - 5) / 4) * (-11.22851-(-3.7628)));
            zz = 5.46462 + (((tickAnim - 5) / 4) * (11.54346-(5.46462)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0.96965 + (((tickAnim - 9) / 9) * (-2.69513-(0.96965)));
            yy = -11.22851 + (((tickAnim - 9) / 9) * (19.30931-(-11.22851)));
            zz = 11.54346 + (((tickAnim - 9) / 9) * (-10.092-(11.54346)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -2.69513 + (((tickAnim - 18) / 5) * (-1.09706-(-2.69513)));
            yy = 19.30931 + (((tickAnim - 18) / 5) * (17.71328-(19.30931)));
            zz = -10.092 + (((tickAnim - 18) / 5) * (-5.7041-(-10.092)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = -1.09706 + (((tickAnim - 23) / 13) * (0-(-1.09706)));
            yy = 17.71328 + (((tickAnim - 23) / 13) * (0-(17.71328)));
            zz = -5.7041 + (((tickAnim - 23) / 13) * (0-(-5.7041)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-5.75-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = -5.75 + (((tickAnim - 5) / 4) * (-17.98-(-5.75)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = -17.98 + (((tickAnim - 9) / 9) * (28.75-(-17.98)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (-0.73711-(0)));
            yy = 28.75 + (((tickAnim - 18) / 5) * (13.71924-(28.75)));
            zz = 0 + (((tickAnim - 18) / 5) * (-3.07643-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = -0.73711 + (((tickAnim - 23) / 13) * (0-(-0.73711)));
            yy = 13.71924 + (((tickAnim - 23) / 13) * (0-(13.71924)));
            zz = -3.07643 + (((tickAnim - 23) / 13) * (0-(-3.07643)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-7.25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = -7.25 + (((tickAnim - 5) / 4) * (-10.71-(-7.25)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = -10.71 + (((tickAnim - 9) / 9) * (16.25-(-10.71)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (-1.12084-(0)));
            yy = 16.25 + (((tickAnim - 18) / 5) * (17.66075-(16.25)));
            zz = 0 + (((tickAnim - 18) / 5) * (-3.65935-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = -1.12084 + (((tickAnim - 23) / 13) * (0-(-1.12084)));
            yy = 17.66075 + (((tickAnim - 23) / 13) * (0-(17.66075)));
            zz = -3.65935 + (((tickAnim - 23) / 13) * (0-(-3.65935)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-15-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (8.43908-(0)));
            yy = -15 + (((tickAnim - 5) / 4) * (-21.62191-(-15)));
            zz = 0 + (((tickAnim - 5) / 4) * (-0.4052-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 8.43908 + (((tickAnim - 9) / 9) * (17.3458-(8.43908)));
            yy = -21.62191 + (((tickAnim - 9) / 9) * (29.89993-(-21.62191)));
            zz = -0.4052 + (((tickAnim - 9) / 9) * (1.34085-(-0.4052)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 17.3458 + (((tickAnim - 18) / 5) * (7.57666-(17.3458)));
            yy = 29.89993 + (((tickAnim - 18) / 5) * (15.5933-(29.89993)));
            zz = 1.34085 + (((tickAnim - 18) / 5) * (-13.47782-(1.34085)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = 7.57666 + (((tickAnim - 23) / 13) * (0-(7.57666)));
            yy = 15.5933 + (((tickAnim - 23) / 13) * (0-(15.5933)));
            zz = -13.47782 + (((tickAnim - 23) / 13) * (0-(-13.47782)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-13-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (9.76595-(0)));
            yy = -13 + (((tickAnim - 5) / 4) * (-26.24982-(-13)));
            zz = 0 + (((tickAnim - 5) / 4) * (3.05461-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 9.76595 + (((tickAnim - 9) / 9) * (20.8604-(9.76595)));
            yy = -26.24982 + (((tickAnim - 9) / 9) * (36.22306-(-26.24982)));
            zz = 3.05461 + (((tickAnim - 9) / 9) * (0.65246-(3.05461)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 20.8604 + (((tickAnim - 18) / 5) * (9.63424-(20.8604)));
            yy = 36.22306 + (((tickAnim - 18) / 5) * (26.39489-(36.22306)));
            zz = 0.65246 + (((tickAnim - 18) / 5) * (-11.55234-(0.65246)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = 9.63424 + (((tickAnim - 23) / 13) * (0-(9.63424)));
            yy = 26.39489 + (((tickAnim - 23) / 13) * (0-(26.39489)));
            zz = -11.55234 + (((tickAnim - 23) / 13) * (0-(-11.55234)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (5.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 5.5 + (((tickAnim - 8) / 5) * (9.5-(5.5)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 9.5 + (((tickAnim - 13) / 5) * (13.5-(9.5)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            yy = 13.5 + (((tickAnim - 18) / 18) * (0-(13.5)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-21.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -21.5 + (((tickAnim - 8) / 5) * (-23.75-(-21.5)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -23.75 + (((tickAnim - 13) / 5) * (-26.25-(-23.75)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            yy = -26.25 + (((tickAnim - 18) / 18) * (0-(-26.25)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-19.75-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -19.75 + (((tickAnim - 13) / 5) * (-26.25-(-19.75)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            yy = -26.25 + (((tickAnim - 18) / 18) * (0-(-26.25)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -4 + (((tickAnim - 13) / 5) * (-3.98851-(-4)));
            yy = 0 + (((tickAnim - 13) / 5) * (-2.96702-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-0.44383-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = -3.98851 + (((tickAnim - 18) / 18) * (0-(-3.98851)));
            yy = -2.96702 + (((tickAnim - 18) / 18) * (0-(-2.96702)));
            zz = -0.44383 + (((tickAnim - 18) / 18) * (0-(-0.44383)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 9 + (((tickAnim - 13) / 5) * (17.25-(9)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 17.25 + (((tickAnim - 18) / 4) * (0-(17.25)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 22) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -5.75 + (((tickAnim - 8) / 10) * (-16-(-5.75)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = -16 + (((tickAnim - 18) / 18) * (0-(-16)));
            yy = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 1.125 + (((tickAnim - 8) / 10) * (-1.695-(1.125)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = -1.695 + (((tickAnim - 18) / 4) * (-1.53-(-1.695)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = -1.53 + (((tickAnim - 22) / 6) * (-1.3-(-1.53)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            yy = -1.3 + (((tickAnim - 28) / 8) * (-0.75-(-1.3)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            yy = -0.75 + (((tickAnim - 36) / 4) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-52-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -52 + (((tickAnim - 8) / 10) * (-18.5-(-52)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = -18.5 + (((tickAnim - 18) / 9) * (-8.79061-(-18.5)));
            yy = 0 + (((tickAnim - 18) / 9) * (2.38274-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (-7.60436-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 36) {
            xx = -8.79061 + (((tickAnim - 27) / 9) * (0-(-8.79061)));
            yy = 2.38274 + (((tickAnim - 27) / 9) * (0-(2.38274)));
            zz = -7.60436 + (((tickAnim - 27) / 9) * (0-(-7.60436)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraStegosaurus entity = (EntityPrehistoricFloraStegosaurus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -7.25 + (((tickAnim - 0) / 9) * (18.75-(-7.25)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 18.75 + (((tickAnim - 9) / 11) * (-7.25-(18.75)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -3 + (((tickAnim - 9) / 4) * (16.37-(-3)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 16.37 + (((tickAnim - 13) / 5) * (-6.45-(16.37)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -6.45 + (((tickAnim - 18) / 2) * (0-(-6.45)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.15 + (((tickAnim - 0) / 2) * (-0.13-(-0.15)));
            yy = -0.35 + (((tickAnim - 0) / 2) * (-0.165-(-0.35)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.13 + (((tickAnim - 2) / 1) * (-0.11-(-0.13)));
            yy = -0.165 + (((tickAnim - 2) / 1) * (-0.125-(-0.165)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -0.11 + (((tickAnim - 3) / 1) * (-0.07-(-0.11)));
            yy = -0.125 + (((tickAnim - 3) / 1) * (-0.12-(-0.125)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -0.07 + (((tickAnim - 4) / 2) * (-0.06-(-0.07)));
            yy = -0.12 + (((tickAnim - 4) / 2) * (-0.105-(-0.12)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -0.06 + (((tickAnim - 6) / 2) * (-0.05-(-0.06)));
            yy = -0.105 + (((tickAnim - 6) / 2) * (-0.195-(-0.105)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -0.05 + (((tickAnim - 8) / 0) * (-0.02-(-0.05)));
            yy = -0.195 + (((tickAnim - 8) / 0) * (-0.575-(-0.195)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -0.02 + (((tickAnim - 8) / 1) * (0-(-0.02)));
            yy = -0.575 + (((tickAnim - 8) / 1) * (-0.95-(-0.575)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (-0.06-(0)));
            yy = -0.95 + (((tickAnim - 9) / 4) * (0.87-(-0.95)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -0.06 + (((tickAnim - 13) / 3) * (-0.1-(-0.06)));
            yy = 0.87 + (((tickAnim - 13) / 3) * (1.215-(0.87)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -0.1 + (((tickAnim - 16) / 4) * (-0.15-(-0.1)));
            yy = 1.215 + (((tickAnim - 16) / 4) * (-0.35-(1.215)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 4.5 + (((tickAnim - 0) / 9) * (-3.77-(4.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -3.77 + (((tickAnim - 9) / 4) * (6.15-(-3.77)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 6.15 + (((tickAnim - 13) / 5) * (0.13-(6.15)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0.13 + (((tickAnim - 18) / 2) * (4.5-(0.13)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 3.25 + (((tickAnim - 0) / 9) * (-11.75-(3.25)));
            yy = 2 + (((tickAnim - 0) / 9) * (0-(2)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -11.75 + (((tickAnim - 9) / 4) * (6.22114-(-11.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.89807-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 6.22114 + (((tickAnim - 13) / 2) * (7.75487-(6.22114)));
            yy = 0.89807 + (((tickAnim - 13) / 2) * (1.99805-(0.89807)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 7.75487 + (((tickAnim - 15) / 3) * (-9.44081-(7.75487)));
            yy = 1.99805 + (((tickAnim - 15) / 3) * (1.99883-(1.99805)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -9.44081 + (((tickAnim - 18) / 2) * (3.25-(-9.44081)));
            yy = 1.99883 + (((tickAnim - 18) / 2) * (2-(1.99883)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 15.75 + (((tickAnim - 0) / 1) * (18.75-(15.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 18.75 + (((tickAnim - 1) / 3) * (3-(18.75)));
            yy = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 3) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 3 + (((tickAnim - 4) / 5) * (-6.5-(3)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -6.5 + (((tickAnim - 9) / 2) * (-6.25-(-6.5)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -6.25 + (((tickAnim - 11) / 9) * (15.75-(-6.25)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));

        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(0);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(0);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -0.5 + (((tickAnim - 0) / 1) * (-3-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = -3 + (((tickAnim - 1) / 3) * (27.75-(-3)));
            yy = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 3) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 27.75 + (((tickAnim - 4) / 5) * (-10.25-(27.75)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -10.25 + (((tickAnim - 9) / 2) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -1.25 + (((tickAnim - 0) / 1) * (-1.4-(-1.25)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            yy = -1.4 + (((tickAnim - 1) / 3) * (0-(-1.4)));
            zz = 0 + (((tickAnim - 1) / 3) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0.75-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (-0.35-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.75 + (((tickAnim - 7) / 2) * (0.7-(0.75)));
            zz = -0.35 + (((tickAnim - 7) / 2) * (0-(-0.35)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0.7 + (((tickAnim - 9) / 2) * (-0.3-(0.7)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = -0.3 + (((tickAnim - 11) / 4) * (-0.42-(-0.3)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = -0.42 + (((tickAnim - 15) / 1) * (-0.54-(-0.42)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = -0.54 + (((tickAnim - 16) / 4) * (-1.25-(-0.54)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -3.75 + (((tickAnim - 0) / 1) * (-3.77-(-3.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = -3.77 + (((tickAnim - 1) / 3) * (3.5-(-3.77)));
            yy = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 3) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 3.5 + (((tickAnim - 4) / 3) * (2.59-(3.5)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 2.59 + (((tickAnim - 7) / 2) * (7.5-(2.59)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 7.5 + (((tickAnim - 9) / 2) * (1.25-(7.5)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 1.25 + (((tickAnim - 11) / 4) * (-1.75-(1.25)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -1.75 + (((tickAnim - 15) / 5) * (-3.75-(-1.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0.475 + (((tickAnim - 0) / 11) * (0-(0.475)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (0.23-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0.23 + (((tickAnim - 14) / 6) * (0.475-(0.23)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -11.5 + (((tickAnim - 0) / 1) * (-11.75-(-11.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -11.75 + (((tickAnim - 1) / 2) * (-8.37-(-11.75)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -8.37 + (((tickAnim - 3) / 0) * (-1.5-(-8.37)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -1.5 + (((tickAnim - 3) / 1) * (11.25-(-1.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 11.25 + (((tickAnim - 4) / 2) * (11.9-(11.25)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 11.9 + (((tickAnim - 6) / 2) * (9.41-(11.9)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 9.41 + (((tickAnim - 8) / 1) * (-4.5-(9.41)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -4.5 + (((tickAnim - 9) / 2) * (6.08-(-4.5)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 6.08 + (((tickAnim - 11) / 5) * (-5.15-(6.08)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -5.15 + (((tickAnim - 16) / 4) * (-11.5-(-5.15)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg4.rotationPointX = this.backleftleg4.rotationPointX + (float)(xx);
        this.backleftleg4.rotationPointY = this.backleftleg4.rotationPointY - (float)(yy);
        this.backleftleg4.rotationPointZ = this.backleftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.25 + (((tickAnim - 0) / 3) * (6.70997-(17.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.43677-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-3.19184-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 6.70997 + (((tickAnim - 3) / 6) * (-21.45582-(6.70997)));
            yy = 1.43677 + (((tickAnim - 3) / 6) * (0.43416-(1.43677)));
            zz = -3.19184 + (((tickAnim - 3) / 6) * (1.96229-(-3.19184)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -21.45582 + (((tickAnim - 9) / 11) * (17.25-(-21.45582)));
            yy = 0.43416 + (((tickAnim - 9) / 11) * (0-(0.43416)));
            zz = 1.96229 + (((tickAnim - 9) / 11) * (0-(1.96229)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -1.2 + (((tickAnim - 0) / 3) * (0-(-1.2)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (-1.2-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.5 + (((tickAnim - 0) / 3) * (-38.75-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = -38.75 + (((tickAnim - 3) / 6) * (1.09511-(-38.75)));
            yy = 0 + (((tickAnim - 3) / 6) * (-2.01529-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (-5.65384-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 1.09511 + (((tickAnim - 9) / 11) * (-0.5-(1.09511)));
            yy = -2.01529 + (((tickAnim - 9) / 11) * (0-(-2.01529)));
            zz = -5.65384 + (((tickAnim - 9) / 11) * (0-(-5.65384)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.15-(0)));
            yy = 0.3 + (((tickAnim - 0) / 3) * (0.35-(0.3)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0.15 + (((tickAnim - 3) / 6) * (0-(0.15)));
            yy = 0.35 + (((tickAnim - 3) / 6) * (0-(0.35)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0.46-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.46 + (((tickAnim - 12) / 3) * (0.8-(0.46)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.8 + (((tickAnim - 15) / 5) * (0.3-(0.8)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -21.45582 + (((tickAnim - 0) / 9) * (16.00269-(-21.45582)));
            yy = 0.43416 + (((tickAnim - 0) / 9) * (1.05576-(0.43416)));
            zz = 1.96229 + (((tickAnim - 0) / 9) * (-1.228-(1.96229)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 16.00269 + (((tickAnim - 9) / 6) * (-0.54003-(16.00269)));
            yy = 1.05576 + (((tickAnim - 9) / 6) * (1.43677-(1.05576)));
            zz = -1.228 + (((tickAnim - 9) / 6) * (-3.19184-(-1.228)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.54003 + (((tickAnim - 15) / 5) * (-21.45582-(-0.54003)));
            yy = 1.43677 + (((tickAnim - 15) / 5) * (0.43416-(1.43677)));
            zz = -3.19184 + (((tickAnim - 15) / 5) * (1.96229-(-3.19184)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 6) * (-0.47-(-0.3)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = -0.47 + (((tickAnim - 6) / 3) * (-1.23-(-0.47)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = -1.23 + (((tickAnim - 9) / 3) * (-0.515-(-1.23)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = -0.515 + (((tickAnim - 12) / 3) * (0-(-0.515)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 1.09511 + (((tickAnim - 0) / 9) * (-4.60233-(1.09511)));
            yy = -2.01529 + (((tickAnim - 0) / 9) * (-1.00574-(-2.01529)));
            zz = -5.65384 + (((tickAnim - 0) / 9) * (-2.82828-(-5.65384)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -4.60233 + (((tickAnim - 9) / 7) * (-38.75-(-4.60233)));
            yy = -1.00574 + (((tickAnim - 9) / 7) * (0-(-1.00574)));
            zz = -2.82828 + (((tickAnim - 9) / 7) * (0-(-2.82828)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -38.75 + (((tickAnim - 16) / 4) * (1.09511-(-38.75)));
            yy = 0 + (((tickAnim - 16) / 4) * (-2.01529-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (-5.65384-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -0.25 + (((tickAnim - 9) / 7) * (-0.25-(-0.25)));
            yy = -0.2 + (((tickAnim - 9) / 7) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -0.25 + (((tickAnim - 16) / 4) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 20.45763 + (((tickAnim - 0) / 4) * (2.82-(20.45763)));
            yy = -1.04717 + (((tickAnim - 0) / 4) * (-1.04717-(-1.04717)));
            zz = 4.63339 + (((tickAnim - 0) / 4) * (4.63339-(4.63339)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 2.82 + (((tickAnim - 4) / 3) * (-3.54237-(2.82)));
            yy = -1.04717 + (((tickAnim - 4) / 3) * (-1.04717-(-1.04717)));
            zz = 4.63339 + (((tickAnim - 4) / 3) * (4.63339-(4.63339)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -3.54237 + (((tickAnim - 7) / 2) * (-11.79237-(-3.54237)));
            yy = -1.04717 + (((tickAnim - 7) / 2) * (-1.04717-(-1.04717)));
            zz = 4.63339 + (((tickAnim - 7) / 2) * (4.63339-(4.63339)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -11.79237 + (((tickAnim - 9) / 7) * (43-(-11.79237)));
            yy = -1.04717 + (((tickAnim - 9) / 7) * (0-(-1.04717)));
            zz = 4.63339 + (((tickAnim - 9) / 7) * (0-(4.63339)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 43 + (((tickAnim - 16) / 2) * (8.07458-(43)));
            yy = 0 + (((tickAnim - 16) / 2) * (-0.6283-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (2.78004-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 8.07458 + (((tickAnim - 18) / 2) * (20.45763-(8.07458)));
            yy = -0.6283 + (((tickAnim - 18) / 2) * (-1.04717-(-0.6283)));
            zz = 2.78004 + (((tickAnim - 18) / 2) * (4.63339-(2.78004)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg4, frontleftleg4.rotateAngleX + (float) Math.toRadians(xx), frontleftleg4.rotateAngleY + (float) Math.toRadians(yy), frontleftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.125 + (((tickAnim - 0) / 4) * (0.485-(0.125)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0.485 + (((tickAnim - 4) / 5) * (-0.02-(0.485)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = -0.02 + (((tickAnim - 9) / 11) * (0.125-(-0.02)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg4.rotationPointX = this.frontleftleg4.rotationPointX + (float)(xx);
        this.frontleftleg4.rotationPointY = this.frontleftleg4.rotationPointY - (float)(yy);
        this.frontleftleg4.rotationPointZ = this.frontleftleg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-360))*1), upperbody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75+250))*1.5), upperbody.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -16 + (((tickAnim - 0) / 3) * (52-(-16)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 52 + (((tickAnim - 3) / 5) * (2.25-(52)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 2.25 + (((tickAnim - 8) / 1) * (20.45763-(2.25)));
            yy = 0 + (((tickAnim - 8) / 1) * (-1.04717-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (4.63339-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 20.45763 + (((tickAnim - 9) / 11) * (-16-(20.45763)));
            yy = -1.04717 + (((tickAnim - 9) / 11) * (0-(-1.04717)));
            zz = 4.63339 + (((tickAnim - 9) / 11) * (0-(4.63339)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg4, frontrightleg4.rotateAngleX + (float) Math.toRadians(xx), frontrightleg4.rotateAngleY + (float) Math.toRadians(yy), frontrightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 2) * (0.4-(-0.325)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            yy = 0.4 + (((tickAnim - 2) / 6) * (-0.175-(0.4)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.175 + (((tickAnim - 8) / 1) * (0.125-(-0.175)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            yy = 0.125 + (((tickAnim - 9) / 7) * (0.065-(0.125)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.065 + (((tickAnim - 16) / 4) * (-0.325-(0.065)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg4.rotationPointX = this.frontrightleg4.rotationPointX + (float)(xx);
        this.frontrightleg4.rotationPointY = this.frontrightleg4.rotationPointY - (float)(yy);
        this.frontrightleg4.rotationPointZ = this.frontrightleg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-360))*7), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75+360))*2));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.275 + (((tickAnim - 2) / 1) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 5) / 2) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 15) / 2) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 18) / 2) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);



        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0.5), body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-250))*1), body2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75+250))*2));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 2) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 3) / 2) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 11) / 2) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 14) / 2) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75+250))*1), body.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.275 + (((tickAnim - 2) / 1) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 5) / 2) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 15) / 2) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 18) / 2) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*5));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*7), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*5));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-850))*8), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*7));
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*10), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*9));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-360))*3), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75+360))*2));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*2), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*5));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 7.75 + (((tickAnim - 0) / 5) * (4.75-(7.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 4.75 + (((tickAnim - 5) / 5) * (7.75-(4.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 7.75 + (((tickAnim - 10) / 5) * (4.75-(7.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 4.75 + (((tickAnim - 15) / 5) * (7.75-(4.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
         EntityPrehistoricFloraStegosaurus entity = (EntityPrehistoricFloraStegosaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 18 + (((tickAnim - 0) / 8) * (3-(18)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 3 + (((tickAnim - 8) / 10) * (-7-(3)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -7 + (((tickAnim - 18) / 22) * (18-(-7)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.7 + (((tickAnim - 0) / 8) * (2.7-(0.7)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 2.7 + (((tickAnim - 8) / 10) * (0-(2.7)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (-0.26-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = -0.26 + (((tickAnim - 19) / 4) * (-0.01-(-0.26)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = -0.01 + (((tickAnim - 23) / 1) * (-0.37-(-0.01)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = -0.37 + (((tickAnim - 24) / 3) * (-0.12-(-0.37)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = -0.12 + (((tickAnim - 27) / 1) * (-0.48-(-0.12)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = -0.48 + (((tickAnim - 28) / 3) * (-0.23-(-0.48)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = -0.23 + (((tickAnim - 31) / 2) * (-0.6-(-0.23)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = -0.6 + (((tickAnim - 33) / 7) * (0.7-(-0.6)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 1 + (((tickAnim - 0) / 6) * (13-(1)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 13 + (((tickAnim - 6) / 9) * (1-(13)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 15) / 25) * (1-(1)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-0.5-(0)));
            yy = -0.9 + (((tickAnim - 0) / 6) * (-0.9-(-0.9)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -0.5 + (((tickAnim - 6) / 9) * (-0.2-(-0.5)));
            yy = -0.9 + (((tickAnim - 6) / 9) * (-1.6-(-0.9)));
            zz = 0 + (((tickAnim - 6) / 9) * (0.1-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = -0.2 + (((tickAnim - 15) / 25) * (0-(-0.2)));
            yy = -1.6 + (((tickAnim - 15) / 25) * (-0.9-(-1.6)));
            zz = 0.1 + (((tickAnim - 15) / 25) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -7 + (((tickAnim - 0) / 8) * (-17-(-7)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -17 + (((tickAnim - 8) / 10) * (6-(-17)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 6 + (((tickAnim - 18) / 22) * (-7-(6)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 2 + (((tickAnim - 18) / 22) * (0-(2)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -8 + (((tickAnim - 0) / 18) * (18-(-8)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 18 + (((tickAnim - 18) / 10) * (3-(18)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 3 + (((tickAnim - 28) / 12) * (-8-(3)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.04-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.04 + (((tickAnim - 2) / 2) * (0.49-(0.04)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0.49 + (((tickAnim - 4) / 1) * (0.04-(0.49)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.04 + (((tickAnim - 5) / 3) * (0.69-(0.04)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.69 + (((tickAnim - 8) / 2) * (0.54-(0.69)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.54 + (((tickAnim - 10) / 3) * (0.79-(0.54)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.79 + (((tickAnim - 13) / 5) * (0.7-(0.79)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0.7 + (((tickAnim - 18) / 10) * (2.7-(0.7)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = 2.7 + (((tickAnim - 28) / 12) * (0-(2.7)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 1 + (((tickAnim - 18) / 10) * (13-(1)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 13 + (((tickAnim - 28) / 12) * (0-(13)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0.9 + (((tickAnim - 0) / 18) * (0-(0.9)));
            yy = -1.4 + (((tickAnim - 0) / 18) * (-0.9-(-1.4)));
            zz = 0.1 + (((tickAnim - 0) / 18) * (0-(0.1)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0.6-(0)));
            yy = -0.9 + (((tickAnim - 18) / 10) * (-0.9-(-0.9)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0.6 + (((tickAnim - 28) / 12) * (0.9-(0.6)));
            yy = -0.9 + (((tickAnim - 28) / 12) * (-1.4-(-0.9)));
            zz = 0 + (((tickAnim - 28) / 12) * (0.1-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 6 + (((tickAnim - 0) / 23) * (-7-(6)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -7 + (((tickAnim - 23) / 9) * (-17-(-7)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -17 + (((tickAnim - 32) / 8) * (6-(-17)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 2 + (((tickAnim - 0) / 23) * (0-(2)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 17) * (2-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 0) / 18) * (-12-(1)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -12 + (((tickAnim - 18) / 10) * (17.91-(-12)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 17.91 + (((tickAnim - 28) / 9) * (-13.18-(17.91)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -13.18 + (((tickAnim - 37) / 3) * (1-(-13.18)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -1 + (((tickAnim - 0) / 5) * (-0.47-(-1)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 5) / 13) * (0-(0)));
            yy = -0.47 + (((tickAnim - 5) / 13) * (-0.9-(-0.47)));
            zz = 0 + (((tickAnim - 5) / 13) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = -0.9 + (((tickAnim - 18) / 22) * (-1-(-0.9)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg4.rotationPointX = this.backleftleg4.rotationPointX + (float)(xx);
        this.backleftleg4.rotationPointY = this.backleftleg4.rotationPointY - (float)(yy);
        this.backleftleg4.rotationPointZ = this.backleftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = -20 + (((tickAnim - 0) / 22) * (11-(-20)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 11 + (((tickAnim - 22) / 2) * (12.59-(11)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 12.59 + (((tickAnim - 24) / 8) * (3-(12.59)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 3 + (((tickAnim - 32) / 8) * (-20-(3)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -1 + (((tickAnim - 0) / 4) * (-0.26-(-1)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.26 + (((tickAnim - 4) / 2) * (-0.37-(-0.26)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.37 + (((tickAnim - 6) / 2) * (-0.12-(-0.37)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = -0.12 + (((tickAnim - 8) / 3) * (-0.48-(-0.12)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -0.48 + (((tickAnim - 11) / 2) * (-0.23-(-0.48)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = -0.23 + (((tickAnim - 13) / 1) * (-0.6-(-0.23)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = -0.6 + (((tickAnim - 14) / 8) * (-1.425-(-0.6)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = -1.425 + (((tickAnim - 22) / 2) * (-0.565-(-1.425)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            yy = -0.565 + (((tickAnim - 24) / 16) * (-1-(-0.565)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 2 + (((tickAnim - 22) / 10) * (-43.21559-(2)));
            yy = 0 + (((tickAnim - 22) / 10) * (2.12681-(0)));
            zz = 0 + (((tickAnim - 22) / 10) * (-3.39477-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -43.21559 + (((tickAnim - 32) / 8) * (0-(-43.21559)));
            yy = 2.12681 + (((tickAnim - 32) / 8) * (0-(2.12681)));
            zz = -3.39477 + (((tickAnim - 32) / 8) * (0-(-3.39477)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.075 + (((tickAnim - 0) / 5) * (0.64-(0.075)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0.64 + (((tickAnim - 5) / 8) * (-0.1-(0.64)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            yy = -0.1 + (((tickAnim - 13) / 9) * (-0.1-(-0.1)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 22) / 10) * (0.4-(0)));
            yy = -0.1 + (((tickAnim - 22) / 10) * (0.2-(-0.1)));
            zz = 0 + (((tickAnim - 22) / 10) * (0.2-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0.4 + (((tickAnim - 32) / 8) * (0-(0.4)));
            yy = 0.2 + (((tickAnim - 32) / 8) * (0.075-(0.2)));
            zz = 0.2 + (((tickAnim - 32) / 8) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 20 + (((tickAnim - 0) / 22) * (-13-(20)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -13 + (((tickAnim - 22) / 5) * (25.6-(-13)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 25.6 + (((tickAnim - 27) / 5) * (50-(25.6)));
            yy = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 50 + (((tickAnim - 32) / 6) * (12.12-(50)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 12.12 + (((tickAnim - 38) / 2) * (20-(12.12)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg4, frontrightleg4.rotateAngleX + (float) Math.toRadians(xx), frontrightleg4.rotateAngleY + (float) Math.toRadians(yy), frontrightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 6) * (0.48-(0.1)));
            zz = 0.1 + (((tickAnim - 0) / 6) * (0.08-(0.1)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0.48 + (((tickAnim - 6) / 5) * (0.68-(0.48)));
            zz = 0.08 + (((tickAnim - 6) / 5) * (0.05-(0.08)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0.68 + (((tickAnim - 11) / 4) * (0.51-(0.68)));
            zz = 0.05 + (((tickAnim - 11) / 4) * (0.03-(0.05)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.51 + (((tickAnim - 15) / 3) * (0.33-(0.51)));
            zz = 0.03 + (((tickAnim - 15) / 3) * (0.01-(0.03)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0.33 + (((tickAnim - 18) / 4) * (0-(0.33)));
            zz = 0.01 + (((tickAnim - 18) / 4) * (0-(0.01)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 18) * (0.35-(0)));
            zz = 0 + (((tickAnim - 22) / 18) * (0.1-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg4.rotationPointX = this.frontrightleg4.rotationPointX + (float)(xx);
        this.frontrightleg4.rotationPointY = this.frontrightleg4.rotationPointY - (float)(yy);
        this.frontrightleg4.rotationPointZ = this.frontrightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 11 + (((tickAnim - 0) / 6) * (12.59-(11)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 12.59 + (((tickAnim - 6) / 7) * (3-(12.59)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 3 + (((tickAnim - 13) / 5) * (-20-(3)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -20 + (((tickAnim - 18) / 22) * (11-(-20)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -1.35 + (((tickAnim - 0) / 6) * (-0.41-(-1.35)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 6) / 12) * (0-(0)));
            yy = -0.41 + (((tickAnim - 6) / 12) * (0-(-0.41)));
            zz = 0 + (((tickAnim - 6) / 12) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (-0.26-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = -0.26 + (((tickAnim - 22) / 1) * (-0.01-(-0.26)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = -0.01 + (((tickAnim - 23) / 1) * (-0.37-(-0.01)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = -0.37 + (((tickAnim - 24) / 4) * (-0.12-(-0.37)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 28) / 0) * (0-(0)));
            yy = -0.12 + (((tickAnim - 28) / 0) * (-0.48-(-0.12)));
            zz = 0 + (((tickAnim - 28) / 0) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = -0.48 + (((tickAnim - 28) / 4) * (-0.23-(-0.48)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = -0.23 + (((tickAnim - 32) / 1) * (-0.6-(-0.23)));
            zz = 0 + (((tickAnim - 32) / 1) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = -0.6 + (((tickAnim - 33) / 7) * (-1.35-(-0.6)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 2 + (((tickAnim - 0) / 13) * (-43.21559-(2)));
            yy = 0 + (((tickAnim - 0) / 13) * (2.12681-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-3.39477-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -43.21559 + (((tickAnim - 13) / 5) * (0-(-43.21559)));
            yy = 2.12681 + (((tickAnim - 13) / 5) * (0-(2.12681)));
            zz = -3.39477 + (((tickAnim - 13) / 5) * (0-(-3.39477)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (2-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.1 + (((tickAnim - 0) / 13) * (0.2-(-0.1)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.2-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.2 + (((tickAnim - 13) / 5) * (0-(0.2)));
            zz = 0.2 + (((tickAnim - 13) / 5) * (0-(0.2)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -11.25 + (((tickAnim - 0) / 3) * (-4-(-11.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = -4 + (((tickAnim - 3) / 10) * (46.36-(-4)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 46.36 + (((tickAnim - 13) / 5) * (12.04-(46.36)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 12.04 + (((tickAnim - 18) / 2) * (20-(12.04)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 20 + (((tickAnim - 20) / 9) * (5.8536-(20)));
            yy = 0 + (((tickAnim - 20) / 9) * (0.20406-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (-1.98957-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 5.8536 + (((tickAnim - 29) / 11) * (-11.25-(5.8536)));
            yy = 0.20406 + (((tickAnim - 29) / 11) * (0-(0.20406)));
            zz = -1.98957 + (((tickAnim - 29) / 11) * (0-(-1.98957)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg4, frontleftleg4.rotateAngleX + (float) Math.toRadians(xx), frontleftleg4.rotateAngleY + (float) Math.toRadians(yy), frontleftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 3) / 17) * (0-(0)));
            yy = 0.1 + (((tickAnim - 3) / 17) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 3) / 17) * (0.1-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.1 + (((tickAnim - 20) / 3) * (0.49-(0.1)));
            zz = 0.1 + (((tickAnim - 20) / 3) * (0.08-(0.1)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = 0.49 + (((tickAnim - 23) / 3) * (1.07-(0.49)));
            zz = 0.08 + (((tickAnim - 23) / 3) * (0.07-(0.08)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            yy = 1.07 + (((tickAnim - 26) / 3) * (0.59-(1.07)));
            zz = 0.07 + (((tickAnim - 26) / 3) * (0.06-(0.07)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            yy = 0.59 + (((tickAnim - 29) / 4) * (0.63-(0.59)));
            zz = 0.06 + (((tickAnim - 29) / 4) * (0.04-(0.06)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            yy = 0.63 + (((tickAnim - 33) / 1) * (0.72-(0.63)));
            zz = 0.04 + (((tickAnim - 33) / 1) * (0.03-(0.04)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            yy = 0.72 + (((tickAnim - 34) / 3) * (0.42-(0.72)));
            zz = 0.03 + (((tickAnim - 34) / 3) * (0.02-(0.03)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 0.42 + (((tickAnim - 37) / 3) * (0-(0.42)));
            zz = 0.02 + (((tickAnim - 37) / 3) * (0-(0.02)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg4.rotationPointX = this.frontleftleg4.rotationPointX + (float)(xx);
        this.frontleftleg4.rotationPointY = this.frontleftleg4.rotationPointY - (float)(yy);
        this.frontleftleg4.rotationPointZ = this.frontleftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -12 + (((tickAnim - 0) / 8) * (17.91-(-12)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 17.91 + (((tickAnim - 8) / 7) * (-9.75-(17.91)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -9.75 + (((tickAnim - 15) / 3) * (1-(-9.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 18) / 22) * (-12-(1)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -0.9 + (((tickAnim - 0) / 18) * (-0.8-(-0.9)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = -0.8 + (((tickAnim - 18) / 3) * (-0.51-(-0.8)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = -0.51 + (((tickAnim - 21) / 2) * (-0.11-(-0.51)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = -0.11 + (((tickAnim - 23) / 3) * (0.49-(-0.11)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 0.49 + (((tickAnim - 26) / 2) * (0.08-(0.49)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0.08 + (((tickAnim - 28) / 3) * (0.72-(0.08)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = 0.72 + (((tickAnim - 31) / 2) * (0.36-(0.72)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            yy = 0.36 + (((tickAnim - 33) / 3) * (0.04-(0.36)));
            zz = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            yy = 0.04 + (((tickAnim - 36) / 4) * (-0.9-(0.04)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg4.rotationPointX = this.backrightleg4.rotationPointX + (float)(xx);
        this.backrightleg4.rotationPointY = this.backrightleg4.rotationPointY - (float)(yy);
        this.backrightleg4.rotationPointZ = this.backrightleg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+50))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+150))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+50))*-1));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 0) / 1) * (-0.25-(-0.1)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 1) / 18) * (0-(0)));
            yy = -0.25 + (((tickAnim - 1) / 18) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 1) / 18) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = -0.45 + (((tickAnim - 22) / 1) * (0-(-0.45)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 23) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 13) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 36) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 3) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 36) / 3) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 39) / 1) * (0-(0)));
            yy = -0.25 + (((tickAnim - 39) / 1) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 39) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+190))*2.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+190))*-3));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+200))*3.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+200))*-5));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+220))*3), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+220))*-5));
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+250))*1), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+250))*-1));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-2.25+Math.sin((Math.PI/180)*(135/0.75-10))*2), body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+150))*-1), body2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+180))*1));
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-360))*1), upperbody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+250))*2), upperbody.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-120))*1));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-10))), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+55))*1.5));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+10))*1), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+150))*1), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+150))*1));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-195))*1), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-150))*1));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-55))*1), body.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.1 + (((tickAnim - 0) / 3) * (-0.5-(-0.1)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.5 + (((tickAnim - 3) / 2) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.5 + (((tickAnim - 8) / 2) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 23) / 2) * (-0.5-(-0.1)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = -0.5 + (((tickAnim - 25) / 3) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = -0.5 + (((tickAnim - 30) / 3) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-65))), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


    }

   

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraStegosaurus e = (EntityPrehistoricFloraStegosaurus) entity;
        animator.update(entity);


    }
}
