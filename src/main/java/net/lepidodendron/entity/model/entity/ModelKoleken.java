package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraKoleken;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelKoleken extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer head2;
    private final AdvancedModelRenderer head3;
    private final AdvancedModelRenderer head4;
    private final AdvancedModelRenderer head5;
    private final AdvancedModelRenderer head6;
    private final AdvancedModelRenderer teeth;
    private final AdvancedModelRenderer teeth2;
    private final AdvancedModelRenderer teeth3;
    private final AdvancedModelRenderer teeth4;
    private final AdvancedModelRenderer teeth5;
    private final AdvancedModelRenderer head7;
    private final AdvancedModelRenderer head8;
    private final AdvancedModelRenderer head9;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer jaw2;
    private final AdvancedModelRenderer jaw3;
    private final AdvancedModelRenderer jaw4;
    private final AdvancedModelRenderer jaw5;
    private final AdvancedModelRenderer teeth6;
    private final AdvancedModelRenderer teeth7;
    private final AdvancedModelRenderer teeth8;
    private final AdvancedModelRenderer teeth9;
    private final AdvancedModelRenderer teeth10;
    private final AdvancedModelRenderer jaw6;
    private final AdvancedModelRenderer jaw7;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer righteye;
    private final AdvancedModelRenderer lefteye;
    private final AdvancedModelRenderer throat3;
    private final AdvancedModelRenderer chest2;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer rightLeg5;

    private ModelAnimator animator;

    public ModelKoleken() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -2.43F, 0.5F);
        this.setRotateAngle(hips, -0.0424F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 45, 100, -3.5F, -3.0F, -5.5F, 7, 14, 14, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.6F, -4.7F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1485F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 104, -5.0F, -3.5F, -11.5F, 10, 12, 12, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.4F, -11.1F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0848F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 39, 60, -4.0F, -2.0F, -6.5F, 8, 9, 7, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.6F, -4.0F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.5569F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 22, 40, -2.5F, -1.0F, -5.0F, 5, 7, 6, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(-0.01F, 6.0F, 1.0F);
        this.neck.addChild(neck1);
        this.setRotateAngle(neck1, 0.5095F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 40, 21, -2.5F, -5.0F, 0.0F, 5, 5, 3, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.4F, -3.5F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.2759F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 39, 32, -2.0F, -1.0F, -4.5F, 4, 6, 5, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(-0.01F, 0.0F, -3.8F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.5732F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 27, 26, -2.0F, -1.0F, -4.0F, 4, 6, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.01F, 0.3F, -3.6F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.1698F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 10, -2.0F, -1.0F, -2.5F, 4, 4, 3, 0.0F, false));

        this.head2 = new AdvancedModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 3.0F, -2.5F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, 0.2759F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 20, 15, -1.5F, -2.0F, -2.1F, 3, 2, 3, 0.0F, false));

        this.head3 = new AdvancedModelRenderer(this);
        this.head3.setRotationPoint(-0.01F, 0.0F, -2.1F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.4458F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 30, 11, -1.5F, -2.0F, -2.0F, 3, 2, 2, 0.0F, false));

        this.head4 = new AdvancedModelRenderer(this);
        this.head4.setRotationPoint(0.0F, -1.0F, -1.9F);
        this.head3.addChild(head4);
        this.setRotateAngle(head4, 0.0424F, 0.0F, 0.0F);
        this.head4.cubeList.add(new ModelBox(head4, 41, 12, -1.0F, -1.0F, -1.0F, 2, 2, 1, 0.0F, false));

        this.head5 = new AdvancedModelRenderer(this);
        this.head5.setRotationPoint(-0.01F, -1.0F, -1.0F);
        this.head4.addChild(head5);
        this.setRotateAngle(head5, -0.4882F, 0.0F, 0.0F);
        this.head5.cubeList.add(new ModelBox(head5, 8, 0, -1.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.head6 = new AdvancedModelRenderer(this);
        this.head6.setRotationPoint(0.02F, -1.0F, 0.0F);
        this.head5.addChild(head6);
        this.setRotateAngle(head6, -0.6156F, 0.0F, 0.0F);
        this.head6.cubeList.add(new ModelBox(head6, 0, 5, -1.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.teeth = new AdvancedModelRenderer(this);
        this.teeth.setRotationPoint(0.0F, 0.24F, -0.9F);
        this.head4.addChild(teeth);
        this.setRotateAngle(teeth, 0.0424F, 0.0F, 0.0F);
        this.teeth.cubeList.add(new ModelBox(teeth, 3, 0, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.teeth2 = new AdvancedModelRenderer(this);
        this.teeth2.setRotationPoint(1.05F, -0.68F, -1.2F);
        this.head3.addChild(teeth2);
        this.setRotateAngle(teeth2, -0.0424F, 0.1911F, 0.0F);
        this.teeth2.cubeList.add(new ModelBox(teeth2, 33, 0, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, false));

        this.teeth3 = new AdvancedModelRenderer(this);
        this.teeth3.setRotationPoint(-1.05F, -0.68F, -1.2F);
        this.head3.addChild(teeth3);
        this.setRotateAngle(teeth3, -0.0424F, -0.1911F, 0.0F);
        this.teeth3.cubeList.add(new ModelBox(teeth3, 26, 0, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, false));

        this.teeth4 = new AdvancedModelRenderer(this);
        this.teeth4.setRotationPoint(1.35F, -0.7F, -1.05F);
        this.head2.addChild(teeth4);
        this.setRotateAngle(teeth4, 0.1061F, 0.0637F, 0.0F);
        this.teeth4.cubeList.add(new ModelBox(teeth4, 43, 3, 0.0F, 0.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.teeth5 = new AdvancedModelRenderer(this);
        this.teeth5.setRotationPoint(-1.3F, -0.8F, -1.1F);
        this.head2.addChild(teeth5);
        this.setRotateAngle(teeth5, 0.1911F, 0.0F, 0.0F);
        this.teeth5.cubeList.add(new ModelBox(teeth5, 38, 3, 0.0F, 0.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.head7 = new AdvancedModelRenderer(this);
        this.head7.setRotationPoint(0.01F, -1.0F, -2.5F);
        this.head.addChild(head7);
        this.setRotateAngle(head7, 0.2972F, 0.0F, 0.0F);
        this.head7.cubeList.add(new ModelBox(head7, 16, 26, -1.0F, 0.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.head8 = new AdvancedModelRenderer(this);
        this.head8.setRotationPoint(0.0F, 0.05F, -2.4F);
        this.head7.addChild(head8);
        this.setRotateAngle(head8, 0.0F, 0.3396F, -0.0424F);
        this.head8.cubeList.add(new ModelBox(head8, 50, 0, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.head9 = new AdvancedModelRenderer(this);
        this.head9.setRotationPoint(0.0F, 0.05F, -2.4F);
        this.head7.addChild(head9);
        this.setRotateAngle(head9, 0.0F, -0.3396F, 0.0424F);
        this.head9.cubeList.add(new ModelBox(head9, 41, 0, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 3.0F, 0.5F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 22, 21, -2.0F, 0.0F, -3.0F, 4, 1, 3, 0.0F, false));

        this.jaw2 = new AdvancedModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.2759F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 9, 5, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.jaw3 = new AdvancedModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, 0.05F, -1.9F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.4245F, 0.0F, 0.0F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 20, 5, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.jaw4 = new AdvancedModelRenderer(this);
        this.jaw4.setRotationPoint(0.01F, 1.0F, 0.0F);
        this.jaw3.addChild(jaw4);
        this.setRotateAngle(jaw4, 0.0637F, 0.0F, 0.0F);
        this.jaw4.cubeList.add(new ModelBox(jaw4, 29, 7, -1.5F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.jaw5 = new AdvancedModelRenderer(this);
        this.jaw5.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.jaw3.addChild(jaw5);
        this.setRotateAngle(jaw5, -0.0213F, 0.0F, 0.0F);
        this.jaw5.cubeList.add(new ModelBox(jaw5, 15, 0, -1.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.teeth6 = new AdvancedModelRenderer(this);
        this.teeth6.setRotationPoint(0.0F, -0.26F, -0.95F);
        this.jaw5.addChild(teeth6);
        this.setRotateAngle(teeth6, -0.1061F, 0.0F, 0.0F);
        this.teeth6.cubeList.add(new ModelBox(teeth6, 0, 0, -0.5F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.teeth7 = new AdvancedModelRenderer(this);
        this.teeth7.setRotationPoint(0.9F, 0.85F, -1.6F);
        this.jaw3.addChild(teeth7);
        this.setRotateAngle(teeth7, -0.0848F, 0.2972F, 0.0F);
        this.teeth7.cubeList.add(new ModelBox(teeth7, 21, 1, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.teeth8 = new AdvancedModelRenderer(this);
        this.teeth8.setRotationPoint(-0.9F, 0.85F, -1.6F);
        this.jaw3.addChild(teeth8);
        this.setRotateAngle(teeth8, -0.0848F, -0.2972F, 0.0F);
        this.teeth8.cubeList.add(new ModelBox(teeth8, 16, 1, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.teeth9 = new AdvancedModelRenderer(this);
        this.teeth9.setRotationPoint(1.3F, 0.85F, -1.2F);
        this.jaw2.addChild(teeth9);
        this.setRotateAngle(teeth9, -0.0637F, 0.0637F, 0.0F);
        this.teeth9.cubeList.add(new ModelBox(teeth9, 11, 1, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.teeth10 = new AdvancedModelRenderer(this);
        this.teeth10.setRotationPoint(-1.2F, 0.85F, -1.2F);
        this.jaw2.addChild(teeth10);
        this.setRotateAngle(teeth10, -0.0637F, -0.0637F, 0.0F);
        this.teeth10.cubeList.add(new ModelBox(teeth10, 6, 1, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.jaw6 = new AdvancedModelRenderer(this);
        this.jaw6.setRotationPoint(-0.01F, 1.7F, -3.0F);
        this.jaw.addChild(jaw6);
        this.setRotateAngle(jaw6, 0.1061F, 0.0F, 0.0F);
        this.jaw6.cubeList.add(new ModelBox(jaw6, 33, 16, -2.0F, -1.0F, 0.0F, 4, 1, 3, 0.0F, false));

        this.jaw7 = new AdvancedModelRenderer(this);
        this.jaw7.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.jaw.addChild(jaw7);
        this.setRotateAngle(jaw7, -0.5943F, 0.0F, 0.0F);
        this.jaw7.cubeList.add(new ModelBox(jaw7, 11, 19, -1.5F, -4.0F, 0.0F, 3, 4, 2, 0.0F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 1.63F, -2.9F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.1698F, 0.0F, 0.0F);
        this.throat.cubeList.add(new ModelBox(throat, 45, 13, -1.0F, -2.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(-0.02F, 0.0F, 3.0F);
        this.throat.addChild(throat2);
        this.setRotateAngle(throat2, 0.8491F, 0.0F, 0.0F);
        this.throat2.cubeList.add(new ModelBox(throat2, 48, 7, -1.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.righteye = new AdvancedModelRenderer(this);
        this.righteye.setRotationPoint(-1.53F, 0.3F, -1.8F);
        this.head.addChild(righteye);
        this.setRotateAngle(righteye, 0.0F, -0.0637F, 0.0F);
        this.righteye.cubeList.add(new ModelBox(righteye, 22, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.lefteye = new AdvancedModelRenderer(this);
        this.lefteye.setRotationPoint(1.53F, 0.3F, -1.8F);
        this.head.addChild(lefteye);
        this.setRotateAngle(lefteye, 0.0F, 0.0637F, 0.0F);
        this.lefteye.cubeList.add(new ModelBox(lefteye, 27, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.throat3 = new AdvancedModelRenderer(this);
        this.throat3.setRotationPoint(0.0F, 5.0F, 0.1F);
        this.neck3.addChild(throat3);
        this.setRotateAngle(throat3, 0.1485F, 0.0F, 0.0F);
        this.throat3.cubeList.add(new ModelBox(throat3, 15, 9, -1.5F, -2.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.chest2 = new AdvancedModelRenderer(this);
        this.chest2.setRotationPoint(0.01F, 7.0F, -6.5F);
        this.chest.addChild(chest2);
        this.setRotateAngle(chest2, -0.4033F, 0.0F, 0.0F);
        this.chest2.cubeList.add(new ModelBox(chest2, 60, 41, -4.0F, -3.0F, 0.0F, 8, 3, 7, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(4.0F, 5.0F, -3.0F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.3609F, 0.2972F, 0.0F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 74, 0, -1.2F, -1.0F, -0.2F, 2, 2, 4, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.7F, 0.0F, 3.2F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.2759F, -0.0213F, -0.0637F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 73, 14, -1.0F, -1.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(-0.2F, 0.1F, 1.9F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.7854F, -0.0637F, -0.1274F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 77, 17, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-4.0F, 5.0F, -3.0F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.3609F, -0.2972F, 0.0F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 74, 7, -0.8F, -1.0F, -0.2F, 2, 2, 4, 0.0F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.7F, 0.0F, 3.2F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.2759F, 0.0213F, 0.0637F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 80, 14, 0.0F, -1.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.2F, 0.1F, 1.9F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.7854F, 0.0637F, 0.1274F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 82, 17, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 8.5F, -11.5F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.1485F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 35, 44, -3.0F, -3.0F, 0.0F, 6, 3, 12, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.4F, 7.5F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1061F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 79, -4.0F, -2.5F, -0.5F, 8, 9, 15, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.4F, 14.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0213F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 59, -3.0F, -2.0F, -0.5F, 6, 6, 13, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.8F, 12.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0848F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 41, -2.0F, -1.0F, -0.5F, 4, 4, 13, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.4F, 11.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1485F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 28, -1.0F, -0.5F, 0.0F, 2, 2, 10, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.1F, 9.5F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.2972F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 18, -0.5F, -0.5F, 0.0F, 1, 1, 8, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(3.425F, 0.5F, 0.0F);
        this.hips.addChild(leftLeg);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 74, 91, -2.0F, -1.5F, -3.5F, 5, 13, 9, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.4F, 10.6F, -2.8F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.6065F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 72, 52, -2.0F, 0.0F, -0.5F, 4, 11, 5, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 10.7F, 2.8F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6156F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 73, 30, -2.0F, 0.0F, -3.0F, 4, 7, 3, -0.003F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 6.58F, -1.5F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0524F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 55, 2, -2.5F, -0.5F, -2.5F, 5, 2, 4, -0.003F, false));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.49F, -1.8F);
        this.leftLeg4.addChild(leftLeg5);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 54, 16, -3.5F, -1.0F, -4.0F, 7, 2, 4, -0.003F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.425F, 0.5F, 0.0F);
        this.hips.addChild(rightLeg);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 74, 91, -3.0F, -1.5F, -3.5F, 5, 13, 9, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.4F, 10.6F, -2.8F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.6065F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 72, 52, -2.0F, 0.0F, -0.5F, 4, 11, 5, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 10.7F, 2.8F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.6156F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 73, 30, -2.0F, 0.0F, -3.0F, 4, 7, 3, -0.003F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 6.58F, -1.5F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.0524F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 55, 2, -2.5F, -0.5F, -2.5F, 5, 2, 4, -0.003F, true));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.49F, -1.8F);
        this.rightLeg4.addChild(rightLeg5);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 54, 16, -3.5F, -1.0F, -4.0F, 7, 2, 4, -0.003F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -0.0F;
        this.hips.offsetX = -0.2F;
        this.hips.offsetZ = 2.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(120);
        this.hips.rotateAngleX = (float)Math.toRadians(1);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 0.8F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.jaw.rotateAngleX = (float) Math.toRadians(23.9);
        this.neck.offsetY = -0.01F;
        this.neck.render(0.01F);
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
        //this.resetToDefaultPose();

        EntityPrehistoricFloraKoleken EntityCerato = (EntityPrehistoricFloraKoleken) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm, this.leftArm2, this.leftArm3};
        AdvancedModelRenderer[] ArmR = {this.rightArm, this.rightArm2, this.rightArm3};

        EntityCerato.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityCerato.getAnimation() == EntityCerato.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.05F, 0.5, f2, 0.7F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityCerato.isReallyInWater()) {

                if (f3 == 0.0F || !EntityCerato.getIsMoving()) {
                    if (EntityCerato.getAnimation() != EntityCerato.EAT_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.leftArm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftArm, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityCerato.getIsFast()) { //Running


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

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKoleken entity = (EntityPrehistoricFloraKoleken) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 3.25 + (((tickAnim - 4) / 5) * (-6.25-(3.25)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -6.25 + (((tickAnim - 9) / 6) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 6.5 + (((tickAnim - 4) / 5) * (13.25-(6.5)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 13.25 + (((tickAnim - 9) / 6) * (0-(13.25)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 8 + (((tickAnim - 4) / 5) * (1.5-(8)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 1.5 + (((tickAnim - 9) / 6) * (0-(1.5)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -20.75 + (((tickAnim - 4) / 3) * (-23.38-(-20.75)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -23.38 + (((tickAnim - 7) / 2) * (-11.5-(-23.38)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -11.5 + (((tickAnim - 9) / 4) * (-0.93-(-11.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -0.93 + (((tickAnim - 13) / 2) * (0-(-0.93)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -12.25 + (((tickAnim - 9) / 4) * (8.25-(-12.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 8.25 + (((tickAnim - 13) / 2) * (0-(8.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 17.25 + (((tickAnim - 4) / 5) * (49.25-(17.25)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 49.25 + (((tickAnim - 9) / 3) * (0-(49.25)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
       
    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKoleken entity = (EntityPrehistoricFloraKoleken) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-4.25 + Math.sin((Math.PI / 180) * (((double) tickAnim / 20) * 120 - 50)) * 2 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -4.25 + Math.sin((Math.PI / 180) * (((double) tickAnim / 20) * 120 - 50)) * 2 + (((tickAnim - 20) / 15) * (0 - (-4.25 + Math.sin((Math.PI / 180) * (((double) tickAnim / 20) * 120 - 50)) * 2)));
            yy = 0 + (((tickAnim - 20) / 15) * (0 - (0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.85 + Math.sin((Math.PI / 180) * (((double) tickAnim / 20) * 120 - 120)) * 4 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -0.85 + Math.sin((Math.PI / 180) * (((double) tickAnim / 20) * 120 - 120)) * 4 + (((tickAnim - 20) / 15) * (0 - (-0.85 + Math.sin((Math.PI / 180) * (((double) tickAnim / 20) * 120 - 120)) * 4)));
            yy = 0 + (((tickAnim - 20) / 15) * (0 - (0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5.6 + Math.sin((Math.PI / 180) * (((double) tickAnim / 20) * 120 - 150)) * 7 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -5.6 + Math.sin((Math.PI / 180) * (((double) tickAnim / 20) * 120 - 150)) * 7 + (((tickAnim - 20) / 15) * (0 - (-5.6 + Math.sin((Math.PI / 180) * (((double) tickAnim / 20) * 120 - 150)) * 7)));
            yy = 0 + (((tickAnim - 20) / 15) * (0 - (0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -5 + (((tickAnim - 20) / 15) * (0 - (-5)));
            yy = 0 + (((tickAnim - 20) / 15) * (0 - (0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.75 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -6.75 + (((tickAnim - 20) / 15) * (0 - (-6.75)));
            yy = 0 + (((tickAnim - 20) / 15) * (0 - (0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10.25 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 10.25 + (((tickAnim - 20) / 8) * (12.75 - (10.25)));
            yy = 0 + (((tickAnim - 20) / 8) * (0 - (0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0 - (0)));
        } else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 12.75 + (((tickAnim - 28) / 7) * (0 - (12.75)));
            yy = 0 + (((tickAnim - 28) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5.25 + Math.sin((Math.PI / 180) * (((double) tickAnim / 20) * 1000)) * 2 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 5.25 + Math.sin((Math.PI / 180) * (((double) tickAnim / 20) * 1000)) * 2 + (((tickAnim - 20) / 15) * (0 - (5.25 + Math.sin((Math.PI / 180) * (((double) tickAnim / 20) * 1000)) * 2)));
            yy = 0 + (((tickAnim - 20) / 15) * (0 - (0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0 - (0)));
            yy = 0 + Math.sin((Math.PI / 180) * (((double) tickAnim / 20) * 1000)) + (((tickAnim - 0) / 35) * (0 - (0 + Math.sin((Math.PI / 180) * (((double) tickAnim / 20) * 1000)))));
            zz = 0 + (((tickAnim - 0) / 35) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0 - (0)));
            yy = 0 + Math.sin((Math.PI / 180) * (((double) tickAnim / 20) * 1000)) + (((tickAnim - 0) / 35) * (0 - (0 + Math.sin((Math.PI / 180) * (((double) tickAnim / 20) * 1000)))));
            zz = 0 + (((tickAnim - 0) / 35) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-27 - (0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0 - (0)));
        } else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -27 + (((tickAnim - 9) / 5) * (-21.5 - (-27)));
            yy = 0 + (((tickAnim - 9) / 5) * (0 - (0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0 - (0)));
        } else if (tickAnim >= 14 && tickAnim < 19) {
            xx = -21.5 + (((tickAnim - 14) / 5) * (-35.5 - (-21.5)));
            yy = 0 + (((tickAnim - 14) / 5) * (0 - (0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0 - (0)));
        } else if (tickAnim >= 19 && tickAnim < 29) {
            xx = -35.5 + (((tickAnim - 19) / 10) * (0 - (-35.5)));
            yy = 0 + (((tickAnim - 19) / 10) * (0 - (0)));
            zz = 0 + (((tickAnim - 19) / 10) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-9.25 - (0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0 - (0)));
        } else if (tickAnim >= 9 && tickAnim < 19) {
            xx = -9.25 + (((tickAnim - 9) / 10) * (-3.5 - (-9.25)));
            yy = 0 + (((tickAnim - 9) / 10) * (0 - (0)));
            zz = 0 + (((tickAnim - 9) / 10) * (0 - (0)));
        } else if (tickAnim >= 19 && tickAnim < 29) {
            xx = -3.5 + (((tickAnim - 19) / 10) * (0 - (-3.5)));
            yy = 0 + (((tickAnim - 19) / 10) * (0 - (0)));
            zz = 0 + (((tickAnim - 19) / 10) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKoleken entity = (EntityPrehistoricFloraKoleken) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 19.75 + (((tickAnim - 15) / 15) * (-13.5-(19.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -13.5 + (((tickAnim - 30) / 20) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (33.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 33.25 + (((tickAnim - 15) / 15) * (-13-(33.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -13 + (((tickAnim - 30) / 20) * (0-(-13)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (-52.75-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -52.75 + (((tickAnim - 20) / 5) * (-51.62-(-52.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -51.62 + (((tickAnim - 25) / 5) * (0-(-51.62)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (1.125-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.375 + (((tickAnim - 20) / 10) * (0-(-0.375)));
            zz = 1.125 + (((tickAnim - 20) / 10) * (0-(1.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (45.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 45.75 + (((tickAnim - 15) / 5) * (85.75-(45.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 85.75 + (((tickAnim - 20) / 5) * (84-(85.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 84 + (((tickAnim - 25) / 5) * (26.25-(84)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 26.25 + (((tickAnim - 30) / 20) * (0-(26.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (1.55-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (-0.375-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.55 + (((tickAnim - 20) / 10) * (0-(1.55)));
            zz = -0.375 + (((tickAnim - 20) / 10) * (0-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (34.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 34.5 + (((tickAnim - 15) / 15) * (0-(34.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKoleken entity = (EntityPrehistoricFloraKoleken) entitylivingbaseIn;
        int animCycle = 150;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-6.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 51) {
            xx = -6.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15 + (((tickAnim - 50) / 1) * (-18.5-(-6.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15)));
            yy = 0 + (((tickAnim - 50) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 1) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 120) {
            xx = -18.5 + (((tickAnim - 51) / 69) * (-18.5-(-18.5)));
            yy = 0 + (((tickAnim - 51) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 69) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = -18.5 + (((tickAnim - 120) / 30) * (0-(-18.5)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = -2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*3 + (((tickAnim - 50) / 70) * (-2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*3-(-2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*3)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = -2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*3 + (((tickAnim - 120) / 30) * (0-(-2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*3)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-0.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = -0.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*1 + (((tickAnim - 50) / 70) * (-0.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*1-(-0.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*1)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = -0.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*1 + (((tickAnim - 120) / 30) * (0-(-0.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*1)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-19-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = -19 + (((tickAnim - 50) / 70) * (-19-(-19)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = -19 + (((tickAnim - 120) / 30) * (0-(-19)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 6 + (((tickAnim - 50) / 70) * (0-(6)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = 15.5 + (((tickAnim - 50) / 4) * (17.5-(15.5)));
            yy = 0 + (((tickAnim - 50) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
            xx = 17.5 + (((tickAnim - 54) / 4) * (15.5-(17.5)));
            yy = 0 + (((tickAnim - 54) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 4) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = 15.5 + (((tickAnim - 58) / 5) * (17.5-(15.5)));
            yy = 0 + (((tickAnim - 58) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
            xx = 17.5 + (((tickAnim - 63) / 4) * (15.5-(17.5)));
            yy = 0 + (((tickAnim - 63) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 4) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 120) {
            xx = 15.5 + (((tickAnim - 67) / 53) * (24.75-(15.5)));
            yy = 0 + (((tickAnim - 67) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 53) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = 24.75 + (((tickAnim - 120) / 30) * (0-(24.75)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = 16 + (((tickAnim - 50) / 4) * (13.25-(16)));
            yy = 0 + (((tickAnim - 50) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
            xx = 13.25 + (((tickAnim - 54) / 4) * (16-(13.25)));
            yy = 0 + (((tickAnim - 54) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 4) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = 16 + (((tickAnim - 58) / 5) * (13.25-(16)));
            yy = 0 + (((tickAnim - 58) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
            xx = 13.25 + (((tickAnim - 63) / 4) * (16-(13.25)));
            yy = 0 + (((tickAnim - 63) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 4) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 120) {
            xx = 16 + (((tickAnim - 67) / 53) * (16.5-(16)));
            yy = 0 + (((tickAnim - 67) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 53) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = 16.5 + (((tickAnim - 120) / 30) * (0-(16.5)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 80) / 11) * (5.5-(0)));
            yy = 0 + (((tickAnim - 80) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 11) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 100) {
            xx = 5.5 + (((tickAnim - 91) / 9) * (0-(5.5)));
            yy = 0 + (((tickAnim - 91) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 73 && tickAnim < 83) {
            xx = 1 + (((tickAnim - 73) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 73) / 10) * (0.02-(1)));
            zz = 1 + (((tickAnim - 73) / 10) * (1-(1)));
        }
        else if (tickAnim >= 83 && tickAnim < 94) {
            xx = 1 + (((tickAnim - 83) / 11) * (1-(1)));
            yy = 0.02 + (((tickAnim - 83) / 11) * (1-(0.02)));
            zz = 1 + (((tickAnim - 83) / 11) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.righteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 73 && tickAnim < 83) {
            xx = 1 + (((tickAnim - 73) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 73) / 10) * (0.02-(1)));
            zz = 1 + (((tickAnim - 73) / 10) * (1-(1)));
        }
        else if (tickAnim >= 83 && tickAnim < 94) {
            xx = 1 + (((tickAnim - 83) / 11) * (1-(1)));
            yy = 0.02 + (((tickAnim - 83) / 11) * (1-(0.02)));
            zz = 1 + (((tickAnim - 83) / 11) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.lefteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*5 + (((tickAnim - 50) / 70) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*5)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3 + (((tickAnim - 50) / 70) * (0-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-3 + (((tickAnim - 50) / 70) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-3-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-3)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-3 + (((tickAnim - 120) / 30) * (0-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-3)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (11.30307-(0)));
            yy = 0 + (((tickAnim - 0) / 120) * (-2.9171-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (1.0936-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = 11.30307 + (((tickAnim - 120) / 30) * (0-(11.30307)));
            yy = -2.9171 + (((tickAnim - 120) / 30) * (0-(-2.9171)));
            zz = 1.0936 + (((tickAnim - 120) / 30) * (0-(1.0936)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = 23.75 + (((tickAnim - 120) / 30) * (0-(23.75)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (5.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 51) {
            xx = 5.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15 + (((tickAnim - 50) / 1) * (17.5-(5.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15)));
            yy = 0 + (((tickAnim - 50) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 1) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 120) {
            xx = 17.5 + (((tickAnim - 51) / 69) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 51) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 69) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = 17.5 + (((tickAnim - 120) / 30) * (0-(17.5)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (5.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 51) {
            xx = 5.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15 + (((tickAnim - 50) / 1) * (17.5-(5.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15)));
            yy = 0 + (((tickAnim - 50) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 1) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 120) {
            xx = 17.5 + (((tickAnim - 51) / 69) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 51) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 69) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = 17.5 + (((tickAnim - 120) / 30) * (0-(17.5)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKoleken entity = (EntityPrehistoricFloraKoleken) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -14 + (((tickAnim - 20) / 10) * (-14-(-14)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -14 + (((tickAnim - 30) / 20) * (0-(-14)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-8.725-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (6.125-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -8.725 + (((tickAnim - 20) / 10) * (-8.725-(-8.725)));
            zz = 6.125 + (((tickAnim - 20) / 10) * (6.125-(6.125)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -8.725 + (((tickAnim - 30) / 20) * (0-(-8.725)));
            zz = 6.125 + (((tickAnim - 30) / 20) * (0-(6.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 7.25 + (((tickAnim - 20) / 10) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 30) / 20) * (0-(7.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 8.5 + (((tickAnim - 20) / 10) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 8.5 + (((tickAnim - 30) / 20) * (0-(8.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10.25 + (((tickAnim - 10) / 10) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (-4-(0)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 38) / 12) * (0-(-4)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (15-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 15 + (((tickAnim - 20) / 10) * (15-(15)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 15 + (((tickAnim - 30) / 8) * (0-(15)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (24-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 24 + (((tickAnim - 20) / 10) * (24-(24)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 24 + (((tickAnim - 30) / 8) * (0-(24)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-22-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -22 + (((tickAnim - 20) / 10) * (-22-(-22)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -22 + (((tickAnim - 30) / 20) * (0-(-22)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (47.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 47.25 + (((tickAnim - 20) / 10) * (47.25-(47.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 47.25 + (((tickAnim - 30) / 20) * (0-(47.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-45.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -45.25 + (((tickAnim - 20) / 10) * (-45.25-(-45.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -45.25 + (((tickAnim - 30) / 20) * (0-(-45.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.425-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.725 + (((tickAnim - 20) / 10) * (-0.725-(-0.725)));
            zz = 1.425 + (((tickAnim - 20) / 10) * (1.425-(1.425)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.725 + (((tickAnim - 30) / 20) * (0-(-0.725)));
            zz = 1.425 + (((tickAnim - 30) / 20) * (0-(1.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (34-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 34 + (((tickAnim - 20) / 10) * (34-(34)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 34 + (((tickAnim - 30) / 20) * (0-(34)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.025-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 1.025 + (((tickAnim - 8) / 12) * (0.6-(1.025)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.6 + (((tickAnim - 20) / 10) * (0.6-(0.6)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 30) / 9) * (0-(0)));
            yy = 0.6 + (((tickAnim - 30) / 9) * (1.025-(0.6)));
            zz = 0 + (((tickAnim - 30) / 9) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 1.025 + (((tickAnim - 39) / 11) * (0-(1.025)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-22-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -22 + (((tickAnim - 20) / 10) * (-22-(-22)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -22 + (((tickAnim - 30) / 20) * (0-(-22)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (47.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 47.25 + (((tickAnim - 20) / 10) * (47.25-(47.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 47.25 + (((tickAnim - 30) / 20) * (0-(47.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-45.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -45.25 + (((tickAnim - 20) / 10) * (-45.25-(-45.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -45.25 + (((tickAnim - 30) / 20) * (0-(-45.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.425-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.725 + (((tickAnim - 20) / 10) * (-0.725-(-0.725)));
            zz = 1.425 + (((tickAnim - 20) / 10) * (1.425-(1.425)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.725 + (((tickAnim - 30) / 20) * (0-(-0.725)));
            zz = 1.425 + (((tickAnim - 30) / 20) * (0-(1.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (34-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 34 + (((tickAnim - 20) / 10) * (34-(34)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 34 + (((tickAnim - 30) / 20) * (0-(34)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.025-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 1.025 + (((tickAnim - 8) / 12) * (0.6-(1.025)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.6 + (((tickAnim - 20) / 10) * (0.6-(0.6)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 30) / 9) * (0-(0)));
            yy = 0.6 + (((tickAnim - 30) / 9) * (1.025-(0.6)));
            zz = 0 + (((tickAnim - 30) / 9) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 1.025 + (((tickAnim - 39) / 11) * (0-(1.025)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKoleken entity = (EntityPrehistoricFloraKoleken) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5.25 + (((tickAnim - 10) / 10) * (0-(5.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13.5 + (((tickAnim - 10) / 10) * (0-(13.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (31.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 31.5 + (((tickAnim - 10) / 10) * (0-(31.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 22.5 + (((tickAnim - 10) / 10) * (0-(22.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (2.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 2.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15 + (((tickAnim - 4) / 6) * (0-(2.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 20.75 + (((tickAnim - 4) / 6) * (0-(20.75)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (15.25-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 15.25 + (((tickAnim - 8) / 2) * (0-(15.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKoleken entity = (EntityPrehistoricFloraKoleken) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            zz = -2.75 + (((tickAnim - 10) / 11) * (0-(-2.75)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (2.75-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -3.5 + (((tickAnim - 30) / 8) * (-5-(-3.5)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 2.75 + (((tickAnim - 30) / 8) * (2.75-(2.75)));
        }
        else if (tickAnim >= 38 && tickAnim < 47) {
            xx = -5 + (((tickAnim - 38) / 9) * (-2.96169-(-5)));
            yy = 0 + (((tickAnim - 38) / 9) * (0.11747-(0)));
            zz = 2.75 + (((tickAnim - 38) / 9) * (2.8741-(2.75)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = -2.96169 + (((tickAnim - 47) / 13) * (0-(-2.96169)));
            yy = 0.11747 + (((tickAnim - 47) / 13) * (0-(0.11747)));
            zz = 2.8741 + (((tickAnim - 47) / 13) * (0-(2.8741)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-13.4-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = -13.4 + (((tickAnim - 30) / 8) * (-13.4-(-13.4)));
        }
        else if (tickAnim >= 38 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 38) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 22) * (0-(0)));
            zz = -13.4 + (((tickAnim - 38) / 22) * (0-(-13.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (3.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 10) / 20) * (-4.00616-(0)));
            yy = 0 + (((tickAnim - 10) / 20) * (0.23579-(0)));
            zz = 3.5 + (((tickAnim - 10) / 20) * (-2.99073-(3.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -4.00616 + (((tickAnim - 30) / 8) * (-5.50616-(-4.00616)));
            yy = 0.23579 + (((tickAnim - 30) / 8) * (0.23579-(0.23579)));
            zz = -2.99073 + (((tickAnim - 30) / 8) * (-2.99073-(-2.99073)));
        }
        else if (tickAnim >= 38 && tickAnim < 47) {
            xx = -5.50616 + (((tickAnim - 38) / 9) * (-3.27734-(-5.50616)));
            yy = 0.23579 + (((tickAnim - 38) / 9) * (0.41377-(0.23579)));
            zz = -2.99073 + (((tickAnim - 38) / 9) * (-4.75978-(-2.99073)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = -3.27734 + (((tickAnim - 47) / 13) * (0-(-3.27734)));
            yy = 0.41377 + (((tickAnim - 47) / 13) * (0-(0.41377)));
            zz = -4.75978 + (((tickAnim - 47) / 13) * (0-(-4.75978)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 47) {
            xx = -5 + (((tickAnim - 30) / 17) * (-2.23127-(-5)));
            yy = 0 + (((tickAnim - 30) / 17) * (-0.21835-(0)));
            zz = 0 + (((tickAnim - 30) / 17) * (4.74499-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = -2.23127 + (((tickAnim - 47) / 13) * (0-(-2.23127)));
            yy = -0.21835 + (((tickAnim - 47) / 13) * (0-(-0.21835)));
            zz = 4.74499 + (((tickAnim - 47) / 13) * (0-(4.74499)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 14 + (((tickAnim - 10) / 8) * (23.75-(14)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 23.75 + (((tickAnim - 18) / 12) * (0-(23.75)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (5-(0)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 60) {
            xx = 5 + (((tickAnim - 38) / 22) * (0-(5)));
            yy = 0 + (((tickAnim - 38) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 13 + (((tickAnim - 10) / 28) * (17.75-(13)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 28) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 60) {
            xx = 17.75 + (((tickAnim - 38) / 22) * (0-(17.75)));
            yy = 0 + (((tickAnim - 38) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -21.75 + (((tickAnim - 10) / 8) * (-27.56-(-21.75)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -27.56 + (((tickAnim - 18) / 6) * (-22.36-(-27.56)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -22.36 + (((tickAnim - 24) / 6) * (0-(-22.36)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -6.75 + (((tickAnim - 18) / 6) * (-11.4-(-6.75)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -11.4 + (((tickAnim - 24) / 6) * (0-(-11.4)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (-6-(0)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 60) {
            xx = -6 + (((tickAnim - 38) / 22) * (0-(-6)));
            yy = 0 + (((tickAnim - 38) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 10 + (((tickAnim - 10) / 8) * (16.5-(10)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 16.5 + (((tickAnim - 18) / 3) * (38.5-(16.5)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 38.5 + (((tickAnim - 21) / 3) * (0-(38.5)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 24) / 14) * (15.75-(0)));
            yy = 0 + (((tickAnim - 24) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 14) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 60) {
            xx = 15.75 + (((tickAnim - 38) / 22) * (0-(15.75)));
            yy = 0 + (((tickAnim - 38) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+40))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 1.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+40))*-3 + (((tickAnim - 10) / 13) * (4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+40))*-3-(1.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+40))*-3)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+40))*-3 + (((tickAnim - 23) / 15) * (1.8523+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+90))*-8-(4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+40))*-3)));
            yy = 0 + (((tickAnim - 23) / 15) * (4.7253+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15-(0)));
            zz = 0 + (((tickAnim - 23) / 15) * (-0.10563-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 60) {
            xx = 1.8523+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+90))*-8 + (((tickAnim - 38) / 22) * (0-(1.8523+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+90))*-8)));
            yy = 4.7253+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15 + (((tickAnim - 38) / 22) * (0-(4.7253+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15)));
            zz = -0.10563 + (((tickAnim - 38) / 22) * (0-(-0.10563)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-5 + (((tickAnim - 10) / 13) * (15.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-15-(2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-5)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 15.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-15 + (((tickAnim - 23) / 15) * (14.7688+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-15-(15.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-15)));
            yy = 0 + (((tickAnim - 23) / 15) * (-0.1997+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-5-(0)));
            zz = 0 + (((tickAnim - 23) / 15) * (0.07654-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 60) {
            xx = 14.7688+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-15 + (((tickAnim - 38) / 22) * (0-(14.7688+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-15)));
            yy = -0.1997+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-5 + (((tickAnim - 38) / 22) * (0-(-0.1997+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-5)));
            zz = 0.07654 + (((tickAnim - 38) / 22) * (0-(0.07654)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (1.62+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 16) {
            xx = 1.62+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*5 + (((tickAnim - 4) / 12) * (-2.3-(1.62+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*5)));
            yy = 0 + (((tickAnim - 4) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 12) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -2.3 + (((tickAnim - 16) / 7) * (-11.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*5-(-2.3)));
            yy = 0 + (((tickAnim - 16) / 7) * (8.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = -11.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*5 + (((tickAnim - 23) / 15) * (-11.08471-(-11.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*5)));
            yy = 8.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15 + (((tickAnim - 23) / 15) * (4.7253+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15-(8.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15)));
            zz = 0 + (((tickAnim - 23) / 15) * (1.02541-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 60) {
            xx = -11.08471 + (((tickAnim - 38) / 22) * (0-(-11.08471)));
            yy = 4.7253+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15 + (((tickAnim - 38) / 22) * (0-(4.7253+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15)));
            zz = 1.02541 + (((tickAnim - 38) / 22) * (0-(1.02541)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (11+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*15-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 11+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*15 + (((tickAnim - 4) / 5) * (15.29+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-15-(11+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*15)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 15.29+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-15 + (((tickAnim - 9) / 7) * (0-(15.29+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-15)));
            yy = 0 + (((tickAnim - 9) / 7) * (-5.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-7-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 16) / 22) * (0-(0)));
            yy = -5.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-7 + (((tickAnim - 16) / 22) * (4.7253+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15-(-5.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-7)));
            zz = 0 + (((tickAnim - 16) / 22) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 38) / 22) * (0-(0)));
            yy = 4.7253+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15 + (((tickAnim - 38) / 22) * (0-(4.7253+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15)));
            zz = 0 + (((tickAnim - 38) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (30-(0)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 23) {
            xx = 30 + (((tickAnim - 9) / 14) * (0-(30)));
            yy = 0 + (((tickAnim - 9) / 14) * (-1.47+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*15-(0)));
            zz = 0 + (((tickAnim - 9) / 14) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            yy = -1.47+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*15 + (((tickAnim - 23) / 8) * (-20.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*35-(-1.47+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*15)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            yy = -20.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*35 + (((tickAnim - 31) / 7) * (-5.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15-(-20.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*35)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 38) / 22) * (0-(0)));
            yy = -5.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15 + (((tickAnim - 38) / 22) * (0-(-5.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15)));
            zz = 0 + (((tickAnim - 38) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 11.25 + (((tickAnim - 15) / 15) * (-12-(11.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -12 + (((tickAnim - 30) / 8) * (-10.5-(-12)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 47) {
            xx = -10.5 + (((tickAnim - 38) / 9) * (22.25-(-10.5)));
            yy = 0 + (((tickAnim - 38) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 9) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 22.25 + (((tickAnim - 47) / 13) * (0-(22.25)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 6.75 + (((tickAnim - 15) / 8) * (33.04-(6.75)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 33.04 + (((tickAnim - 23) / 7) * (-10.5-(33.04)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -10.5 + (((tickAnim - 30) / 8) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -10.5 + (((tickAnim - 38) / 4) * (32.73-(-10.5)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = 32.73 + (((tickAnim - 42) / 5) * (-4.5-(32.73)));
            yy = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = -4.5 + (((tickAnim - 47) / 13) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 2.75 + (((tickAnim - 15) / 8) * (-54.02-(2.75)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -54.02 + (((tickAnim - 23) / 4) * (-43.34-(-54.02)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -43.34 + (((tickAnim - 27) / 3) * (0-(-43.34)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (-35.25-(0)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = -35.25 + (((tickAnim - 42) / 5) * (0-(-35.25)));
            yy = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -0.4 + (((tickAnim - 23) / 7) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (46.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 46.25 + (((tickAnim - 15) / 6) * (98.98-(46.25)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 98.98 + (((tickAnim - 21) / 2) * (98-(98.98)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 98 + (((tickAnim - 23) / 4) * (88.55-(98)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 88.55 + (((tickAnim - 27) / 3) * (26.75-(88.55)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 26.75 + (((tickAnim - 30) / 8) * (26.75-(26.75)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 26.75 + (((tickAnim - 38) / 4) * (91.77-(26.75)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = 91.77 + (((tickAnim - 42) / 5) * (19-(91.77)));
            yy = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 19 + (((tickAnim - 47) / 13) * (0-(19)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.2-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0.525-(0)));
            zz = -0.2 + (((tickAnim - 15) / 15) * (0-(-0.2)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 0.525 + (((tickAnim - 30) / 8) * (0.525-(0.525)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 38) / 9) * (0-(0)));
            yy = 0.525 + (((tickAnim - 38) / 9) * (-0.75-(0.525)));
            zz = 0 + (((tickAnim - 38) / 9) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            yy = -0.75 + (((tickAnim - 47) / 13) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-54.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -54.25 + (((tickAnim - 15) / 6) * (10-(-54.25)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 10 + (((tickAnim - 21) / 2) * (0-(10)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (14.75-(0)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = 14.75 + (((tickAnim - 42) / 5) * (-33-(14.75)));
            yy = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = -33 + (((tickAnim - 47) / 13) * (0-(-33)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -17.25 + (((tickAnim - 10) / 5) * (-11.75-(-17.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -11.75 + (((tickAnim - 15) / 15) * (13.25-(-11.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 13.25 + (((tickAnim - 30) / 8) * (14-(13.25)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 47) {
            xx = 14 + (((tickAnim - 38) / 9) * (-4.5-(14)));
            yy = 0 + (((tickAnim - 38) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 9) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = -4.5 + (((tickAnim - 47) / 13) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 6.25 + (((tickAnim - 5) / 5) * (-9.5-(6.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -9.5 + (((tickAnim - 10) / 5) * (-5-(-9.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -5 + (((tickAnim - 15) / 15) * (0.5-(-5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0.5 + (((tickAnim - 30) / 8) * (2.5-(0.5)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 47) {
            xx = 2.5 + (((tickAnim - 38) / 9) * (8-(2.5)));
            yy = 0 + (((tickAnim - 38) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 9) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 54) {
            xx = 8 + (((tickAnim - 47) / 7) * (43.5-(8)));
            yy = 0 + (((tickAnim - 47) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 7) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 43.5 + (((tickAnim - 54) / 6) * (0-(43.5)));
            yy = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-52.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -52.5 + (((tickAnim - 5) / 5) * (0-(-52.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (-1-(0)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 47) {
            xx = -1 + (((tickAnim - 38) / 9) * (-10.5-(-1)));
            yy = 0 + (((tickAnim - 38) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 9) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 54) {
            xx = -10.5 + (((tickAnim - 47) / 7) * (-38.09-(-10.5)));
            yy = 0 + (((tickAnim - 47) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 7) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = -38.09 + (((tickAnim - 54) / 6) * (0-(-38.09)));
            yy = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 5) / 42) * (0-(0)));
            yy = -0.375 + (((tickAnim - 5) / 42) * (-0.375-(-0.375)));
            zz = 0 + (((tickAnim - 5) / 42) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            yy = -0.375 + (((tickAnim - 47) / 13) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (95.63-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 95.63 + (((tickAnim - 5) / 5) * (26.75-(95.63)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 26.75 + (((tickAnim - 10) / 5) * (17.75-(26.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 17.75 + (((tickAnim - 15) / 15) * (-7.5-(17.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -7.5 + (((tickAnim - 30) / 8) * (-8.5-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 47) {
            xx = -8.5 + (((tickAnim - 38) / 9) * (9.5-(-8.5)));
            yy = 0 + (((tickAnim - 38) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 9) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 54) {
            xx = 9.5 + (((tickAnim - 47) / 7) * (79.66-(9.5)));
            yy = 0 + (((tickAnim - 47) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 7) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 79.66 + (((tickAnim - 54) / 6) * (0-(79.66)));
            yy = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 10) / 5) * (1-(0.525)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 1 + (((tickAnim - 15) / 8) * (0.65-(1)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.65 + (((tickAnim - 23) / 7) * (-0.8-(0.65)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 30) / 17) * (0-(0)));
            yy = -0.8 + (((tickAnim - 30) / 17) * (-0.8-(-0.8)));
            zz = 0 + (((tickAnim - 30) / 17) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            yy = -0.8 + (((tickAnim - 47) / 13) * (0-(-0.8)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 10) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 37) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 47) / 7) * (24.5-(0)));
            yy = 0 + (((tickAnim - 47) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 7) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 24.5 + (((tickAnim - 54) / 6) * (0-(24.5)));
            yy = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKoleken entity = (EntityPrehistoricFloraKoleken) entitylivingbaseIn;
        int animCycle = 150;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-6.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 51) {
            xx = -6.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15 + (((tickAnim - 50) / 1) * (-18.5-(-6.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15)));
            yy = 0 + (((tickAnim - 50) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 1) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 120) {
            xx = -18.5 + (((tickAnim - 51) / 69) * (-18.5-(-18.5)));
            yy = 0 + (((tickAnim - 51) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 69) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = -18.5 + (((tickAnim - 120) / 30) * (0-(-18.5)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0.525-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0.525 + (((tickAnim - 50) / 70) * (0.525-(0.525)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0.525 + (((tickAnim - 120) / 30) * (0-(0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = -2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*3 + (((tickAnim - 50) / 30) * (-5.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-50))*0.5-(-2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*3)));
            yy = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 30) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -5.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-50))*0.5 + (((tickAnim - 80) / 40) * (-2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-50))*0.5-(-5.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-50))*0.5)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = -2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-50))*0.5 + (((tickAnim - 120) / 30) * (0-(-2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-50))*0.5)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (2.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = 2.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*1 + (((tickAnim - 120) / 30) * (0-(2.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*1)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-19-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = -19 + (((tickAnim - 50) / 70) * (-19-(-19)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = -19 + (((tickAnim - 120) / 30) * (0-(-19)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 6 + (((tickAnim - 50) / 70) * (0-(6)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 120) / 18) * (16.75-(0)));
            yy = 0 + (((tickAnim - 120) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 18) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 150) {
            xx = 16.75 + (((tickAnim - 138) / 12) * (0-(16.75)));
            yy = 0 + (((tickAnim - 138) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(-0.525);



        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 120) {
            xx = 15.5 + (((tickAnim - 19) / 101) * (-25.75-(15.5)));
            yy = 0 + (((tickAnim - 19) / 101) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 101) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 128) {
            xx = -25.75 + (((tickAnim - 120) / 8) * (-33.93+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-30-(-25.75)));
            yy = 0 + (((tickAnim - 120) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 8) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 150) {
            xx = -33.93+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-30 + (((tickAnim - 128) / 22) * (0-(-33.93+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-30)));
            yy = 0 + (((tickAnim - 128) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(0);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(0);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = 16 + (((tickAnim - 50) / 4) * (13.25-(16)));
            yy = 0 + (((tickAnim - 50) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
            xx = 13.25 + (((tickAnim - 54) / 4) * (16-(13.25)));
            yy = 0 + (((tickAnim - 54) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 4) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = 16 + (((tickAnim - 58) / 5) * (13.25-(16)));
            yy = 0 + (((tickAnim - 58) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
            xx = 13.25 + (((tickAnim - 63) / 4) * (16-(13.25)));
            yy = 0 + (((tickAnim - 63) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 4) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 120) {
            xx = 16 + (((tickAnim - 67) / 53) * (0-(16)));
            yy = 0 + (((tickAnim - 67) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 53) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 120) / 10) * (26.25-(0)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 10) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 150) {
            xx = 26.25 + (((tickAnim - 130) / 20) * (0-(26.25)));
            yy = 0 + (((tickAnim - 130) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 80) / 11) * (5.5-(0)));
            yy = 0 + (((tickAnim - 80) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 11) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 100) {
            xx = 5.5 + (((tickAnim - 91) / 9) * (0-(5.5)));
            yy = 0 + (((tickAnim - 91) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 9) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 120) / 5) * (15.5-(0)));
            yy = 0 + (((tickAnim - 120) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 5) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 130) {
            xx = 15.5 + (((tickAnim - 125) / 5) * (0-(15.5)));
            yy = 0 + (((tickAnim - 125) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 5) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 137) {
            xx = 0 + (((tickAnim - 130) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 7) * (0-(0)));
        }
        else if (tickAnim >= 137 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 137) / 6) * (19.18112-(0)));
            yy = 0 + (((tickAnim - 137) / 6) * (-0.19824-(0)));
            zz = 0 + (((tickAnim - 137) / 6) * (-0.24464-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 148) {
            xx = 19.18112 + (((tickAnim - 143) / 5) * (0-(19.18112)));
            yy = -0.19824 + (((tickAnim - 143) / 5) * (0-(-0.19824)));
            zz = -0.24464 + (((tickAnim - 143) / 5) * (0-(-0.24464)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 73 && tickAnim < 83) {
            xx = 1 + (((tickAnim - 73) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 73) / 10) * (0.02-(1)));
            zz = 1 + (((tickAnim - 73) / 10) * (1-(1)));
        }
        else if (tickAnim >= 83 && tickAnim < 94) {
            xx = 1 + (((tickAnim - 83) / 11) * (1-(1)));
            yy = 0.02 + (((tickAnim - 83) / 11) * (1-(0.02)));
            zz = 1 + (((tickAnim - 83) / 11) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.righteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 73 && tickAnim < 83) {
            xx = 1 + (((tickAnim - 73) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 73) / 10) * (0.02-(1)));
            zz = 1 + (((tickAnim - 73) / 10) * (1-(1)));
        }
        else if (tickAnim >= 83 && tickAnim < 94) {
            xx = 1 + (((tickAnim - 83) / 11) * (1-(1)));
            yy = 0.02 + (((tickAnim - 83) / 11) * (1-(0.02)));
            zz = 1 + (((tickAnim - 83) / 11) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.lefteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*5 + (((tickAnim - 50) / 70) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*5)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3 + (((tickAnim - 50) / 70) * (0-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-3 + (((tickAnim - 50) / 70) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-3-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-3)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-3 + (((tickAnim - 120) / 30) * (0-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-3)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (11.30307-(0)));
            yy = 0 + (((tickAnim - 0) / 120) * (-2.9171-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (1.0936-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = 11.30307 + (((tickAnim - 120) / 30) * (0-(11.30307)));
            yy = -2.9171 + (((tickAnim - 120) / 30) * (0-(-2.9171)));
            zz = 1.0936 + (((tickAnim - 120) / 30) * (0-(1.0936)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = 23.75 + (((tickAnim - 120) / 30) * (0-(23.75)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (5.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 51) {
            xx = 5.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15 + (((tickAnim - 50) / 1) * (17.5-(5.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15)));
            yy = 0 + (((tickAnim - 50) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 1) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 120) {
            xx = 17.5 + (((tickAnim - 51) / 69) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 51) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 69) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = 17.5 + (((tickAnim - 120) / 30) * (0-(17.5)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (5.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 51) {
            xx = 5.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15 + (((tickAnim - 50) / 1) * (17.5-(5.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15)));
            yy = 0 + (((tickAnim - 50) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 1) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 120) {
            xx = 17.5 + (((tickAnim - 51) / 69) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 51) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 69) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = 17.5 + (((tickAnim - 120) / 30) * (0-(17.5)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-69.361826028+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*20-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (27.9750367261+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*10-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (-80.3495767687+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-20-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = -69.361826028+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*20 + (((tickAnim - 50) / 70) * (-69.361826028+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*20-(-69.361826028+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*20)));
            yy = 27.9750367261+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*10 + (((tickAnim - 50) / 70) * (27.9750367261+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*10-(27.9750367261+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*10)));
            zz = -80.3495767687+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-20 + (((tickAnim - 50) / 70) * (-80.3495767687+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-20-(-80.3495767687+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-20)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = -69.361826028+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*20 + (((tickAnim - 120) / 30) * (0-(-69.361826028+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*20)));
            yy = 27.9750367261+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*10 + (((tickAnim - 120) / 30) * (0-(27.9750367261+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*10)));
            zz = -80.3495767687+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-20 + (((tickAnim - 120) / 30) * (0-(-80.3495767687+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-69.361826028+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*20-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (-27.9750367261+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*10-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (80.3495767687+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*20-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = -69.361826028+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*20 + (((tickAnim - 50) / 70) * (-69.361826028+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*20-(-69.361826028+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*20)));
            yy = -27.9750367261+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*10 + (((tickAnim - 50) / 70) * (-27.9750367261+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*10-(-27.9750367261+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*10)));
            zz = 80.3495767687+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*20 + (((tickAnim - 50) / 70) * (80.3495767687+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*20-(80.3495767687+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*20)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = -69.361826028+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*20 + (((tickAnim - 120) / 30) * (0-(-69.361826028+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*20)));
            yy = -27.9750367261+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*10 + (((tickAnim - 120) / 30) * (0-(-27.9750367261+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*10)));
            zz = 80.3495767687+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*20 + (((tickAnim - 120) / 30) * (0-(80.3495767687+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -34.25 + (((tickAnim - 17) / 6) * (-22.25-(-34.25)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 41) {
            xx = -22.25 + (((tickAnim - 23) / 18) * (-52.75-(-22.25)));
            yy = 0 + (((tickAnim - 23) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 18) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = -52.75 + (((tickAnim - 41) / 5) * (-44.5-(-52.75)));
            yy = 0 + (((tickAnim - 41) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 5) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -44.5 + (((tickAnim - 46) / 4) * (-52.75-(-44.5)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = -52.75 + (((tickAnim - 50) / 4) * (-44.5-(-52.75)));
            yy = 0 + (((tickAnim - 50) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
            xx = -44.5 + (((tickAnim - 54) / 4) * (-52.75-(-44.5)));
            yy = 0 + (((tickAnim - 54) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 4) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 62) {
            xx = -52.75 + (((tickAnim - 58) / 4) * (-44.5-(-52.75)));
            yy = 0 + (((tickAnim - 58) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 4) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 67) {
            xx = -44.5 + (((tickAnim - 62) / 5) * (-41-(-44.5)));
            yy = 0 + (((tickAnim - 62) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 5) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 71) {
            xx = -41 + (((tickAnim - 67) / 4) * (-35-(-41)));
            yy = 0 + (((tickAnim - 67) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 4) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 75) {
            xx = -35 + (((tickAnim - 71) / 4) * (-38.75-(-35)));
            yy = 0 + (((tickAnim - 71) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 4) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 79) {
            xx = -38.75 + (((tickAnim - 75) / 4) * (-25.75-(-38.75)));
            yy = 0 + (((tickAnim - 75) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 4) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 88) {
            xx = -25.75 + (((tickAnim - 79) / 9) * (-32.25-(-25.75)));
            yy = 0 + (((tickAnim - 79) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 9) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 93) {
            xx = -32.25 + (((tickAnim - 88) / 5) * (-22-(-32.25)));
            yy = 0 + (((tickAnim - 88) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 5) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 98) {
            xx = -22 + (((tickAnim - 93) / 5) * (-15.5-(-22)));
            yy = 0 + (((tickAnim - 93) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 5) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 117) {
            xx = -15.5 + (((tickAnim - 98) / 19) * (-18.25-(-15.5)));
            yy = 0 + (((tickAnim - 98) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 19) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 124) {
            xx = -18.25 + (((tickAnim - 117) / 7) * (-15-(-18.25)));
            yy = 0 + (((tickAnim - 117) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 7) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 129) {
            xx = -15 + (((tickAnim - 124) / 5) * (0-(-15)));
            yy = 0 + (((tickAnim - 124) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 0) / 37) * (18.91071-(0)));
            yy = 0 + (((tickAnim - 0) / 37) * (-0.43403-(0)));
            zz = 0 + (((tickAnim - 0) / 37) * (-0.03203-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 49) {
            xx = 18.91071 + (((tickAnim - 37) / 12) * (27.88027-(18.91071)));
            yy = -0.43403 + (((tickAnim - 37) / 12) * (-0.58199-(-0.43403)));
            zz = -0.03203 + (((tickAnim - 37) / 12) * (-0.04295-(-0.03203)));
        }
        else if (tickAnim >= 49 && tickAnim < 60) {
            xx = 27.88027 + (((tickAnim - 49) / 11) * (13.60389-(27.88027)));
            yy = -0.58199 + (((tickAnim - 49) / 11) * (-0.71023-(-0.58199)));
            zz = -0.04295 + (((tickAnim - 49) / 11) * (-0.05242-(-0.04295)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 13.60389 + (((tickAnim - 60) / 15) * (6.35389-(13.60389)));
            yy = -0.71023 + (((tickAnim - 60) / 15) * (-0.71023-(-0.71023)));
            zz = -0.05242 + (((tickAnim - 60) / 15) * (-0.05242-(-0.05242)));
        }
        else if (tickAnim >= 75 && tickAnim < 79) {
            xx = 6.35389 + (((tickAnim - 75) / 4) * (-18.64611-(6.35389)));
            yy = -0.71023 + (((tickAnim - 75) / 4) * (-0.71023-(-0.71023)));
            zz = -0.05242 + (((tickAnim - 75) / 4) * (-0.05242-(-0.05242)));
        }
        else if (tickAnim >= 79 && tickAnim < 88) {
            xx = -18.64611 + (((tickAnim - 79) / 9) * (2.10389-(-18.64611)));
            yy = -0.71023 + (((tickAnim - 79) / 9) * (-0.71023-(-0.71023)));
            zz = -0.05242 + (((tickAnim - 79) / 9) * (-0.05242-(-0.05242)));
        }
        else if (tickAnim >= 88 && tickAnim < 93) {
            xx = 2.10389 + (((tickAnim - 88) / 5) * (-22.14611-(2.10389)));
            yy = -0.71023 + (((tickAnim - 88) / 5) * (-0.71023-(-0.71023)));
            zz = -0.05242 + (((tickAnim - 88) / 5) * (-0.05242-(-0.05242)));
        }
        else if (tickAnim >= 93 && tickAnim < 98) {
            xx = -22.14611 + (((tickAnim - 93) / 5) * (-21.89611-(-22.14611)));
            yy = -0.71023 + (((tickAnim - 93) / 5) * (-0.71023-(-0.71023)));
            zz = -0.05242 + (((tickAnim - 93) / 5) * (-0.05242-(-0.05242)));
        }
        else if (tickAnim >= 98 && tickAnim < 103) {
            xx = -21.89611 + (((tickAnim - 98) / 5) * (-7.64611-(-21.89611)));
            yy = -0.71023 + (((tickAnim - 98) / 5) * (-0.71023-(-0.71023)));
            zz = -0.05242 + (((tickAnim - 98) / 5) * (-0.05242-(-0.05242)));
        }
        else if (tickAnim >= 103 && tickAnim < 117) {
            xx = -7.64611 + (((tickAnim - 103) / 14) * (6.60389-(-7.64611)));
            yy = -0.71023 + (((tickAnim - 103) / 14) * (-0.71023-(-0.71023)));
            zz = -0.05242 + (((tickAnim - 103) / 14) * (-0.05242-(-0.05242)));
        }
        else if (tickAnim >= 117 && tickAnim < 120) {
            xx = 6.60389 + (((tickAnim - 117) / 3) * (7.55772-(6.60389)));
            yy = -0.71023 + (((tickAnim - 117) / 3) * (-0.39457-(-0.71023)));
            zz = -0.05242 + (((tickAnim - 117) / 3) * (-0.02912-(-0.05242)));
        }
        else if (tickAnim >= 120 && tickAnim < 124) {
            xx = 7.55772 + (((tickAnim - 120) / 4) * (-22.75-(7.55772)));
            yy = -0.39457 + (((tickAnim - 120) / 4) * (0-(-0.39457)));
            zz = -0.02912 + (((tickAnim - 120) / 4) * (0-(-0.02912)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-1.09-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -1.09 + (((tickAnim - 8) / 9) * (24.25-(-1.09)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 24.25 + (((tickAnim - 17) / 6) * (3.75-(24.25)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 41) {
            xx = 3.75 + (((tickAnim - 23) / 18) * (-0.75-(3.75)));
            yy = 0 + (((tickAnim - 23) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 18) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 98) {
            xx = -0.75 + (((tickAnim - 41) / 57) * (-15-(-0.75)));
            yy = 0 + (((tickAnim - 41) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 57) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 124) {
            xx = -15 + (((tickAnim - 98) / 26) * (-10.68-(-15)));
            yy = 0 + (((tickAnim - 98) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 26) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 130) {
            xx = -10.68 + (((tickAnim - 124) / 6) * (-10.68-(-10.68)));
            yy = 0 + (((tickAnim - 124) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 6) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 135) {
            xx = -10.68 + (((tickAnim - 130) / 5) * (0-(-10.68)));
            yy = 0 + (((tickAnim - 130) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat3, throat3.rotateAngleX + (float) Math.toRadians(xx), throat3.rotateAngleY + (float) Math.toRadians(yy), throat3.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKoleken entity = (EntityPrehistoricFloraKoleken) entitylivingbaseIn;
        int animCycle = 18;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393/0.5))*3), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393))*0.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393+20))*2.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393/0.5-50))*1.45);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393/0.5-120))*-1);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393/0.5-120))*3.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393))*-0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393+150))*3));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393/0.5-180))*3.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393+250))*3));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393/0.5-250))*4.5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393/0.5-220))*-4.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-5.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393/0.5-300))*4.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393/0.5-250))*5), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393+250))*3));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393/0.5-250))*5), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393+250))*3));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393/0.5-50))*-2.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393))*-1), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393+20))*2.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393/0.5-100))*3), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393-50))*-3), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393+50))*2.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393/0.5-150))*5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393-100))*-6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393+100))*2.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393/0.5-200))*8), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393-150))*-10), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393+150))*4));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393/0.5-250))*11), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393-200))*-16), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*393+200))*8));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -26.39457 + (((tickAnim - 0) / 10) * (18.68009-(-26.39457)));
            yy = 2.45107 + (((tickAnim - 0) / 10) * (-7.82093-(2.45107)));
            zz = 4.92515 + (((tickAnim - 0) / 10) * (-2.63415-(4.92515)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 18.68009 + (((tickAnim - 10) / 8) * (-26.39457-(18.68009)));
            yy = -7.82093 + (((tickAnim - 10) / 8) * (2.45107-(-7.82093)));
            zz = -2.63415 + (((tickAnim - 10) / 8) * (4.92515-(-2.63415)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -6.75 + (((tickAnim - 0) / 10) * (31.5-(-6.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 31.5 + (((tickAnim - 10) / 2) * (40.55-(31.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 40.55 + (((tickAnim - 12) / 6) * (-6.75-(40.55)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.625 + (((tickAnim - 0) / 10) * (0-(-0.625)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 0) / 10) * (-12-(5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -12 + (((tickAnim - 10) / 3) * (-61.52-(-12)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -61.52 + (((tickAnim - 13) / 3) * (-61.52-(-61.52)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -61.52 + (((tickAnim - 16) / 2) * (5-(-61.52)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (-0.9-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (1.275-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -0.9 + (((tickAnim - 13) / 3) * (-0.9-(-0.9)));
            zz = 1.275 + (((tickAnim - 13) / 3) * (1.275-(1.275)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = -0.9 + (((tickAnim - 16) / 2) * (0-(-0.9)));
            zz = 1.275 + (((tickAnim - 16) / 2) * (0-(1.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 29.07042 + (((tickAnim - 0) / 3) * (8.02079-(29.07042)));
            yy = 3.59593 + (((tickAnim - 0) / 3) * (1.15105-(3.59593)));
            zz = -5.71618 + (((tickAnim - 0) / 3) * (-5.88895-(-5.71618)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 8.02079 + (((tickAnim - 3) / 3) * (74.02-(8.02079)));
            yy = 1.15105 + (((tickAnim - 3) / 3) * (0-(1.15105)));
            zz = -5.88895 + (((tickAnim - 3) / 3) * (0-(-5.88895)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 74.02 + (((tickAnim - 6) / 4) * (49-(74.02)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 49 + (((tickAnim - 10) / 3) * (101.02-(49)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 101.02 + (((tickAnim - 13) / 3) * (101.02-(101.02)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 101.02 + (((tickAnim - 16) / 2) * (29.07042-(101.02)));
            yy = 0 + (((tickAnim - 16) / 2) * (3.59593-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (-5.71618-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.725 + (((tickAnim - 0) / 2) * (0.35-(0.725)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.35 + (((tickAnim - 2) / 1) * (-0.85-(0.35)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -0.85 + (((tickAnim - 3) / 1) * (-0.675-(-0.85)));
            zz = 0 + (((tickAnim - 3) / 1) * (-0.19-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.675 + (((tickAnim - 4) / 2) * (0.795-(-0.675)));
            zz = -0.19 + (((tickAnim - 4) / 2) * (-0.575-(-0.19)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.795 + (((tickAnim - 6) / 4) * (0.7-(0.795)));
            zz = -0.575 + (((tickAnim - 6) / 4) * (0-(-0.575)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 0.7 + (((tickAnim - 10) / 8) * (0.725-(0.7)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (-84.25-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -84.25 + (((tickAnim - 6) / 4) * (31.5-(-84.25)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 31.5 + (((tickAnim - 10) / 8) * (0-(31.5)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (-0.34-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0.36-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.34 + (((tickAnim - 4) / 2) * (-0.675-(-0.34)));
            zz = 0.36 + (((tickAnim - 4) / 2) * (-1.175-(0.36)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = -0.675 + (((tickAnim - 6) / 4) * (0-(-0.675)));
            zz = -1.175 + (((tickAnim - 6) / 4) * (0-(-1.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 18.68009 + (((tickAnim - 0) / 8) * (-26.39457-(18.68009)));
            yy = 7.82093 + (((tickAnim - 0) / 8) * (-2.45107-(7.82093)));
            zz = 2.63415 + (((tickAnim - 0) / 8) * (-4.92515-(2.63415)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -26.39457 + (((tickAnim - 8) / 10) * (18.68009-(-26.39457)));
            yy = -2.45107 + (((tickAnim - 8) / 10) * (7.82093-(-2.45107)));
            zz = -4.92515 + (((tickAnim - 8) / 10) * (2.63415-(-4.92515)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 31.5 + (((tickAnim - 0) / 2) * (40.55-(31.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 40.55 + (((tickAnim - 2) / 6) * (-6.75-(40.55)));
            yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -6.75 + (((tickAnim - 8) / 10) * (31.5-(-6.75)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = -0.625 + (((tickAnim - 8) / 10) * (0-(-0.625)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -12 + (((tickAnim - 0) / 4) * (-61.52-(-12)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -61.52 + (((tickAnim - 4) / 2) * (-61.52-(-61.52)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -61.52 + (((tickAnim - 6) / 2) * (5-(-61.52)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 5 + (((tickAnim - 8) / 10) * (-12-(5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (1.275-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.9 + (((tickAnim - 4) / 2) * (-0.9-(-0.9)));
            zz = 1.275 + (((tickAnim - 4) / 2) * (1.275-(1.275)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.9 + (((tickAnim - 6) / 2) * (0-(-0.9)));
            zz = 1.275 + (((tickAnim - 6) / 2) * (0-(1.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 49 + (((tickAnim - 0) / 4) * (101.02-(49)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 101.02 + (((tickAnim - 4) / 2) * (101.02-(101.02)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 101.02 + (((tickAnim - 6) / 2) * (29.07042-(101.02)));
            yy = 0 + (((tickAnim - 6) / 2) * (-3.59593-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (5.71618-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 29.07042 + (((tickAnim - 8) / 4) * (3.30366-(29.07042)));
            yy = -3.59593 + (((tickAnim - 8) / 4) * (-0.57804-(-3.59593)));
            zz = 5.71618 + (((tickAnim - 8) / 4) * (5.21817-(5.71618)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 3.30366 + (((tickAnim - 12) / 2) * (74.02-(3.30366)));
            yy = -0.57804 + (((tickAnim - 12) / 2) * (0-(-0.57804)));
            zz = 5.21817 + (((tickAnim - 12) / 2) * (0-(5.21817)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 74.02 + (((tickAnim - 14) / 4) * (49-(74.02)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.7 + (((tickAnim - 0) / 8) * (0.525-(0.7)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.525 + (((tickAnim - 8) / 1) * (1.21-(0.525)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 1.21 + (((tickAnim - 9) / 1) * (0.9-(1.21)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.9 + (((tickAnim - 10) / 2) * (-0.975-(0.9)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -0.975 + (((tickAnim - 12) / 1) * (-0.83-(-0.975)));
            zz = 0 + (((tickAnim - 12) / 1) * (-0.19-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = -0.83 + (((tickAnim - 13) / 1) * (-0.105-(-0.83)));
            zz = -0.19 + (((tickAnim - 13) / 1) * (-0.575-(-0.19)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = -0.105 + (((tickAnim - 14) / 4) * (0.7-(-0.105)));
            zz = -0.575 + (((tickAnim - 14) / 4) * (0-(-0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 31.5 + (((tickAnim - 0) / 8) * (0-(31.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (-84.25-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -84.25 + (((tickAnim - 14) / 4) * (31.5-(-84.25)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (-0.34-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0.36-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = -0.34 + (((tickAnim - 13) / 1) * (-0.675-(-0.34)));
            zz = 0.36 + (((tickAnim - 13) / 1) * (-1.175-(0.36)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = -0.675 + (((tickAnim - 14) / 4) * (0-(-0.675)));
            zz = -1.175 + (((tickAnim - 14) / 4) * (0-(-1.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);
        

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKoleken entity = (EntityPrehistoricFloraKoleken) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -17.40228 + (((tickAnim - 0) / 20) * (1.591+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*15-(-17.40228)));
            yy = 1.87602 + (((tickAnim - 0) / 20) * (-4.43385-(1.87602)));
            zz = 5.96287 + (((tickAnim - 0) / 20) * (-1.70565-(5.96287)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 1.591+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*15 + (((tickAnim - 20) / 15) * (-17.40228-(1.591+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*15)));
            yy = -4.43385 + (((tickAnim - 20) / 15) * (1.87602-(-4.43385)));
            zz = -1.70565 + (((tickAnim - 20) / 15) * (5.96287-(-1.70565)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -5.5 + (((tickAnim - 0) / 20) * (24.75-(-5.5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 24.75 + (((tickAnim - 20) / 5) * (32.92-(24.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 32.92 + (((tickAnim - 25) / 10) * (-5.5-(32.92)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -13 + (((tickAnim - 20) / 5) * (-58.42-(-13)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -58.42 + (((tickAnim - 25) / 5) * (-64.17-(-58.42)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -64.17 + (((tickAnim - 30) / 5) * (0-(-64.17)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 20) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (-0.95-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = -0.95 + (((tickAnim - 25) / 5) * (-0.95-(-0.95)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -0.95 + (((tickAnim - 30) / 5) * (-0.3-(-0.95)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 24.35471 + (((tickAnim - 0) / 7) * (11.4998-(24.35471)));
            yy = 2.84447 + (((tickAnim - 0) / 7) * (1.89632-(2.84447)));
            zz = -5.84697 + (((tickAnim - 0) / 7) * (-3.89798-(-5.84697)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 11.4998 + (((tickAnim - 7) / 6) * (74.8949-(11.4998)));
            yy = 1.89632 + (((tickAnim - 7) / 6) * (0.94816-(1.89632)));
            zz = -3.89798 + (((tickAnim - 7) / 6) * (-1.94899-(-3.89798)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 74.8949 + (((tickAnim - 13) / 7) * (57.79-(74.8949)));
            yy = 0.94816 + (((tickAnim - 13) / 7) * (0-(0.94816)));
            zz = -1.94899 + (((tickAnim - 13) / 7) * (0-(-1.94899)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 57.79 + (((tickAnim - 20) / 5) * (57.79-(57.79)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 57.79 + (((tickAnim - 25) / 5) * (78.54-(57.79)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 78.54 + (((tickAnim - 30) / 5) * (24.35471-(78.54)));
            yy = 0 + (((tickAnim - 30) / 5) * (2.84447-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (-5.84697-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 7) * (0.15-(-0.325)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0.15 + (((tickAnim - 7) / 4) * (0.11-(0.15)));
            zz = 0 + (((tickAnim - 7) / 4) * (-0.42-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.11 + (((tickAnim - 11) / 2) * (-0.935-(0.11)));
            zz = -0.42 + (((tickAnim - 11) / 2) * (-0.675-(-0.42)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            yy = -0.935 + (((tickAnim - 13) / 22) * (-0.325-(-0.935)));
            zz = -0.675 + (((tickAnim - 13) / 22) * (0-(-0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 26.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-75))*15 + (((tickAnim - 0) / 5) * (21.06603-(26.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-75))*15)));
            yy = 2.625 + (((tickAnim - 0) / 5) * (4.43385-(2.625)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.70565-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 21.06603 + (((tickAnim - 5) / 15) * (-2.681+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15-(21.06603)));
            yy = 4.43385 + (((tickAnim - 5) / 15) * (-1.5767-(4.43385)));
            zz = 1.70565 + (((tickAnim - 5) / 15) * (-5.00828-(1.70565)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -2.681+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15 + (((tickAnim - 20) / 15) * (6.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-175))*9-(-2.681+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15)));
            yy = -1.5767 + (((tickAnim - 20) / 15) * (2.625-(-1.5767)));
            zz = -5.00828 + (((tickAnim - 20) / 15) * (0-(-5.00828)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 62.5 + (((tickAnim - 0) / 5) * (57.79-(62.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 57.79 + (((tickAnim - 5) / 5) * (57.79-(57.79)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 57.79 + (((tickAnim - 10) / 5) * (78.54-(57.79)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 78.54 + (((tickAnim - 15) / 5) * (22.60471-(78.54)));
            yy = 0 + (((tickAnim - 15) / 5) * (-2.84447-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (5.84697-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 22.60471 + (((tickAnim - 20) / 7) * (2.5-(22.60471)));
            yy = -2.84447 + (((tickAnim - 20) / 7) * (0-(-2.84447)));
            zz = 5.84697 + (((tickAnim - 20) / 7) * (0-(5.84697)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 2.5 + (((tickAnim - 27) / 8) * (62.5-(2.5)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0.225 + (((tickAnim - 0) / 20) * (-0.025-(0.225)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = -0.025 + (((tickAnim - 20) / 3) * (0.965-(-0.025)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0.965 + (((tickAnim - 23) / 4) * (0.36-(0.965)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = 0.36 + (((tickAnim - 27) / 2) * (0.255-(0.36)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = 0.255 + (((tickAnim - 29) / 3) * (0.105-(0.255)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = 0.105 + (((tickAnim - 32) / 3) * (0.225-(0.105)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -39.5 + (((tickAnim - 0) / 5) * (21-(-39.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 21 + (((tickAnim - 5) / 15) * (0-(21)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (-32.25-(0)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -32.25 + (((tickAnim - 30) / 5) * (-39.5-(-32.25)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 5 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 5) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 22) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 3) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (-0.375-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -0.175 + (((tickAnim - 30) / 5) * (0-(-0.175)));
            zz = -0.375 + (((tickAnim - 30) / 5) * (0-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-90))*1.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-90))*-0.3), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-80))*-1.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-20))*-0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-50))*0.5);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-190))*1.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-90))*0.3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-160))*1.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-280))*1), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-190))*-1.5));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-350))*3), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-450))*3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-400))*-3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-380))*-1), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat3, throat3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-380))*2), throat3.rotateAngleY + (float) Math.toRadians(0), throat3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-280))*-3), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-190))*-1.5));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-280))*-3), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-190))*-1.5));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-90))*1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205))*1), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-80))*-1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-50))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-80))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-50))*-3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-100))*4), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-130))*1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-100))*-5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-150))*7), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-160))*3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-150))*-10), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-200))*12), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-200))*6));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (-87.25-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -87.25 + (((tickAnim - 13) / 7) * (21-(-87.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 21 + (((tickAnim - 20) / 15) * (0-(21)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (-0.75-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -0.55 + (((tickAnim - 13) / 7) * (0-(-0.55)));
            zz = -0.75 + (((tickAnim - 13) / 7) * (0-(-0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 13.5 + (((tickAnim - 0) / 5) * (24.75-(13.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 24.75 + (((tickAnim - 5) / 5) * (32.92-(24.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 32.92 + (((tickAnim - 10) / 10) * (-5.5-(32.92)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -5.5 + (((tickAnim - 20) / 15) * (13.5-(-5.5)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -13 + (((tickAnim - 5) / 5) * (-58.42-(-13)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -58.42 + (((tickAnim - 10) / 5) * (-64.17-(-58.42)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -64.17 + (((tickAnim - 15) / 5) * (0-(-64.17)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-0.95-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.95 + (((tickAnim - 10) / 5) * (-0.95-(-0.95)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.95 + (((tickAnim - 15) / 5) * (-0.3-(-0.95)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = -0.3 + (((tickAnim - 20) / 15) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);


    }




    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraKoleken ee = (EntityPrehistoricFloraKoleken) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
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
            //moving in water
            //
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
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The idle noise/anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The actual roar/anim
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) { //The actual roar/anim
            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraKoleken e = (EntityPrehistoricFloraKoleken) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.neck2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
